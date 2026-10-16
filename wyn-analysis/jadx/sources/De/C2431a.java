package de;

import Ba.c;
import C8.i;
import Ef.E;
import G9.e;
import Ge.h;
import ac.C1346a;
import ae.g;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import be.EnumC1525a;
import com.qonversion.android.sdk.dto.QonversionError;
import ef.C2515C;
import ef.C2527k;
import ff.AbstractC2641B;
import io.qonversion.nocodes.internal.screen.view.ScreenActivity;
import java.lang.ref.WeakReference;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import re.C3977a;
import re.C3979c;
import tf.p;
import wg.b;

/* renamed from: de.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2431a extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f34285a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f34286b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f34287c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2431a(e eVar, String str, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f34286b = eVar;
        this.f34287c = str;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C2431a(this.f34286b, this.f34287c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2431a) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        g gVar;
        Ge.g gVar2;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f34285a;
        C2515C c2515c = C2515C.f34653a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return c2515c;
        }
        Fe.e.U(obj);
        Ce.a aVar2 = (Ce.a) this.f34286b.f4687d;
        this.f34285a = 1;
        aVar2.getClass();
        StringBuilder sb2 = new StringBuilder("showScreen() -> Fetching the screen with the context key ");
        String str = this.f34287c;
        String strC = b.c(sb2, str, " from the API");
        C1346a c1346a = (C1346a) aVar2.f421a;
        c1346a.O(strC);
        WeakReference weakReference = ((De.a) aVar2.f2198c).f2658a;
        Context context = weakReference != null ? (Activity) weakReference.get() : null;
        if (context == null) {
            context = (Application) aVar2.f2199d;
        }
        i iVar = (i) aVar2.f2197b;
        WeakReference weakReference2 = (WeakReference) iVar.f1943f;
        if (weakReference2 == null || (gVar2 = (Ge.g) weakReference2.get()) == null) {
            gVar = new g();
        } else {
            h hVar = gVar2.f4746a;
            gVar = (g) hVar.f4748b.get(str);
            if (gVar == null && (gVar = hVar.f4747a) == null) {
                gVar = new g();
            }
        }
        int i10 = ScreenActivity.f37467b;
        AbstractC3340k.e(context, "context");
        ae.h screenPresentationStyle = gVar.f17651a;
        AbstractC3340k.e(screenPresentationStyle, "screenPresentationStyle");
        Intent intent = new Intent(context, (Class<?>) ScreenActivity.class);
        intent.putExtra("contextKey", str);
        intent.putExtra(com.qonversion.android.sdk.automations.mvp.ScreenActivity.INTENT_SCREEN_PRESENTATION_STYLE, screenPresentationStyle);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
            C3977a c3977a = (C3977a) ((i) c1346a.f17489b).f1941d;
            ae.a aVar3 = c3977a.f44801a;
            ae.a aVar4 = ae.a.f17623b;
            if (aVar3.f17625a <= 10) {
                Log.i(c3977a.f44802b, C1346a.K("showScreen() -> Screen intent will process with a non-activity context"), null);
            }
        }
        try {
            c1346a.O("showScreen() -> Launching the screen activity");
            context.startActivity(intent);
            C2527k c2527kX = AbstractC2641B.x(screenPresentationStyle);
            if (c2527kX != null) {
                if (context instanceof Activity) {
                    ((Activity) context).overridePendingTransition(((Number) c2527kX.f34671a).intValue(), ((Number) c2527kX.f34672b).intValue());
                } else {
                    c.U(c1346a, "Can't use transition animations, cause the provided context is not an activity.");
                }
            }
        } catch (Exception e7) {
            c.q(c1346a, "showScreen() -> " + ("Failed to open the screen with the context key " + str + " with exception: " + e7));
            e eVar = new e(EnumC1525a.f19459b, "Failed to open the screen with the context key ".concat(str), (QonversionError) null);
            C3979c c3979c = (C3979c) iVar.f1942e;
            if (c3979c != null) {
                c3979c.d(eVar);
            }
        }
        return c2515c == aVar ? aVar : c2515c;
    }
}
