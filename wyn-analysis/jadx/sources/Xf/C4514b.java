package xf;

import com.google.android.gms.common.api.internal.f0;
import java.util.Random;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: xf.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4514b extends AbstractC4513a {

    /* renamed from: b, reason: collision with root package name */
    public final f0 f47896b = new f0(3);

    @Override // xf.AbstractC4513a
    public final Random g() {
        Object obj = this.f47896b.get();
        AbstractC3340k.d(obj, "get(...)");
        return (Random) obj;
    }
}
