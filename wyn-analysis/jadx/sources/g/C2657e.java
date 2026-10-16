package g;

import h.AbstractC2762a;
import java.util.HashMap;

/* renamed from: g.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2657e extends AbstractC2655c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35460a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f35461b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC2762a f35462c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f35463d;

    public /* synthetic */ C2657e(h hVar, String str, AbstractC2762a abstractC2762a, int i5) {
        this.f35460a = i5;
        this.f35463d = hVar;
        this.f35461b = str;
        this.f35462c = abstractC2762a;
    }

    @Override // g.AbstractC2655c
    public final void a(Object obj) {
        switch (this.f35460a) {
            case 0:
                h hVar = this.f35463d;
                HashMap map = hVar.f35469b;
                String str = this.f35461b;
                Integer num = (Integer) map.get(str);
                AbstractC2762a abstractC2762a = this.f35462c;
                if (num != null) {
                    hVar.f35471d.add(str);
                    try {
                        hVar.b(num.intValue(), abstractC2762a, obj);
                        return;
                    } catch (Exception e7) {
                        hVar.f35471d.remove(str);
                        throw e7;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC2762a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            default:
                h hVar2 = this.f35463d;
                HashMap map2 = hVar2.f35469b;
                String str2 = this.f35461b;
                Integer num2 = (Integer) map2.get(str2);
                AbstractC2762a abstractC2762a2 = this.f35462c;
                if (num2 != null) {
                    hVar2.f35471d.add(str2);
                    try {
                        hVar2.b(num2.intValue(), abstractC2762a2, obj);
                        return;
                    } catch (Exception e10) {
                        hVar2.f35471d.remove(str2);
                        throw e10;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC2762a2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
    }

    public void b() {
        this.f35463d.f(this.f35461b);
    }
}
