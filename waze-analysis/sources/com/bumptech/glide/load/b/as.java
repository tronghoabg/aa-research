package com.bumptech.glide.load.b;

import android.util.Log;
import androidx.collection.SieveCacheKt;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class as implements com.bumptech.glide.load.data.e {

    /* renamed from: a, reason: collision with root package name */
    private final Object f3233a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f3234b;

    as(Object obj, int i2) {
        this.f3234b = i2;
        this.f3233a = obj;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return this.f3234b != 0 ? ByteBuffer.class : this.f3233a.getClass();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void bk() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final void d() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final void f(com.bumptech.glide.p pVar, com.bumptech.glide.load.data.d dVar) throws Throwable {
        Throwable th;
        RandomAccessFile randomAccessFile;
        int i2 = this.f3234b;
        Object obj = this.f3233a;
        if (i2 == 0) {
            dVar.b(obj);
            return;
        }
        try {
            int i3 = com.bumptech.glide.g.c.f2893a;
            FileChannel fileChannel = null;
            try {
                long length = ((File) obj).length();
                if (length > SieveCacheKt.NodeLinkMask) {
                    throw new IOException("File too large to map into memory");
                }
                if (length == 0) {
                    throw new IOException("File unsuitable for memory mapping");
                }
                randomAccessFile = new RandomAccessFile((File) obj, "r");
                try {
                    FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
                    try {
                        MappedByteBuffer mappedByteBufferLoad = fileChannelConvertMaybeLegacyFileChannelFromLibrary.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                        if (fileChannelConvertMaybeLegacyFileChannelFromLibrary != null) {
                            try {
                                fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                            } catch (IOException unused) {
                            }
                        }
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused2) {
                        }
                        dVar.b(mappedByteBufferLoad);
                    } catch (Throwable th2) {
                        th = th2;
                        fileChannel = fileChannelConvertMaybeLegacyFileChannelFromLibrary;
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (randomAccessFile == null) {
                            throw th;
                        }
                        try {
                            randomAccessFile.close();
                            throw th;
                        } catch (IOException unused4) {
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                randomAccessFile = null;
            }
        } catch (IOException e2) {
            if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e2);
            }
            dVar.e(e2);
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final int g() {
        return 1;
    }
}
