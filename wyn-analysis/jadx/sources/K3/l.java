package K3;

import android.content.Context;
import kotlin.jvm.internal.AbstractC3340k;
import o3.C3645b;
import o3.InterfaceC3646c;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements InterfaceC3646c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f6493a;

    public /* synthetic */ l(Context context) {
        this.f6493a = context;
    }

    @Override // o3.InterfaceC3646c
    public o3.d c(C3645b c3645b) {
        Context context = this.f6493a;
        N2.j callback = c3645b.f41343c;
        AbstractC3340k.e(callback, "callback");
        String str = c3645b.f41342b;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new p3.h(context, str, callback, true, true);
    }
}
