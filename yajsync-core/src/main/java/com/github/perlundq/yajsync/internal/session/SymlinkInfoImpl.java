/*
 * Copyright (C) 2016 Per Lundqvist
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.perlundq.yajsync.internal.session;

import com.github.perlundq.yajsync.attr.RsyncFileAttributes;
import com.github.perlundq.yajsync.attr.SymlinkInfo;

class SymlinkInfoImpl extends FileInfoImpl implements SymlinkInfo
{
    private final String _targetPathName;

    public SymlinkInfoImpl(String pathName, byte[] pathNameBytes,
                           RsyncFileAttributes attrs, String targetPathName)
    {
        super(pathName, pathNameBytes, attrs);
        assert targetPathName != null;
        assert attrs().isSymbolicLink();
        _targetPathName = targetPathName;
    }

    @Override
    public String targetPathName()
    {
        return _targetPathName;
    }
}