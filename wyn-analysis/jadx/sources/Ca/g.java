package Ca;

import androidx.lifecycle.EnumC1449m;
import androidx.lifecycle.G;
import androidx.lifecycle.InterfaceC1456u;
import com.google.android.gms.common.api.p;
import java.io.Closeable;

/* loaded from: classes4.dex */
public interface g extends Closeable, InterfaceC1456u, p {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @G(EnumC1449m.ON_DESTROY)
    void close();
}
