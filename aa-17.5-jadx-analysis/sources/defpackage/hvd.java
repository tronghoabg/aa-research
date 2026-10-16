package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class hvd extends hvh {
    @Override // defpackage.huv
    public final Class a() {
        return ParcelFileDescriptor.class;
    }

    @Override // defpackage.hvh
    protected final /* bridge */ /* synthetic */ Object f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorH = h(uri);
        if (assetFileDescriptorH != null) {
            return assetFileDescriptorH.getParcelFileDescriptor();
        }
        throw new FileNotFoundException("FileDescriptor is null for: ".concat(String.valueOf(String.valueOf(uri))));
    }

    @Override // defpackage.hvh
    protected final /* synthetic */ void g(Object obj) throws IOException {
        ((ParcelFileDescriptor) obj).close();
    }
}
