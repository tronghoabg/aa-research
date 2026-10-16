package defpackage;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;

/* loaded from: classes2.dex */
public final class hvi implements huw {
    @Override // defpackage.huw
    public final /* synthetic */ hux a(Object obj) {
        return new ParcelFileDescriptorRewinder((ParcelFileDescriptor) obj);
    }

    @Override // defpackage.huw
    public final Class b() {
        return ParcelFileDescriptor.class;
    }
}
