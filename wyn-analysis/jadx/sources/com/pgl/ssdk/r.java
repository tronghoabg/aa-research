package com.pgl.ssdk;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/* loaded from: classes4.dex */
public abstract class r {
    public static q a(RandomAccessFile randomAccessFile, long j8, long j10) {
        return a(randomAccessFile.getChannel(), j8, j10);
    }

    public static q a(FileChannel fileChannel, long j8, long j10) {
        fileChannel.getClass();
        return new m(fileChannel, j8, j10);
    }
}
