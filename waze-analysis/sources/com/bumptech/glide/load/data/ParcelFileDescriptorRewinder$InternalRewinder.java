package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ParcelFileDescriptorRewinder$InternalRewinder {

    /* renamed from: a, reason: collision with root package name */
    private final ParcelFileDescriptor f3454a;

    ParcelFileDescriptorRewinder$InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f3454a = parcelFileDescriptor;
    }

    ParcelFileDescriptor rewind() throws IOException, ErrnoException {
        try {
            Os.lseek(this.f3454a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
            return this.f3454a;
        } catch (ErrnoException e2) {
            throw new IOException(e2);
        }
    }
}
