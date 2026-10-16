package com.bumptech.glide.load.data;

/* JADX INFO: loaded from: classes2.dex */
public final class ParcelFileDescriptorRewinder implements defpackage.hvh {
    private final com.bumptech.glide.load.data.ParcelFileDescriptorRewinder.InternalRewinder a;

    private static final class InternalRewinder {
        private final android.os.ParcelFileDescriptor a;

        public InternalRewinder(android.os.ParcelFileDescriptor parcelFileDescriptor) {
            this.a = parcelFileDescriptor;
        }

        public android.os.ParcelFileDescriptor rewind() throws java.io.IOException {
            try {
                android.system.Os.lseek(this.a.getFileDescriptor(), 0L, android.system.OsConstants.SEEK_SET);
                return this.a;
            } catch (android.system.ErrnoException e) {
                throw new java.io.IOException(e);
            }
        }
    }

    public ParcelFileDescriptorRewinder(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new com.bumptech.glide.load.data.ParcelFileDescriptorRewinder.InternalRewinder(parcelFileDescriptor);
    }

    public static boolean d() {
        return !"robolectric".equals(android.os.Build.FINGERPRINT);
    }

    @Override // defpackage.hvh
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final android.os.ParcelFileDescriptor a() throws java.io.IOException {
        return this.a.rewind();
    }

    @Override // defpackage.hvh
    public final void b() {
    }
}
