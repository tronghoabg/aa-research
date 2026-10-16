package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import android.content.Context;
import android.content.Intent;
import com.moloco.sdk.internal.ortb.model.C1899m;
import com.moloco.sdk.internal.ortb.model.C1901o;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2063d extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f31344a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s f31345b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f31346c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2063d(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s sVar, String str, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31344a = context;
        this.f31345b = sVar;
        this.f31346c = str;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C2063d(this.f31344a, this.f31345b, this.f31346c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C2063d c2063d = (C2063d) create((Ef.E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        c2063d.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        String str;
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        Context context = this.f31344a;
        Intent intent = new Intent(context, (Class<?>) VastActivity.class);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s sVar = this.f31345b;
        intent.putExtra("START_MUTED", sVar.f32387a);
        intent.putExtra("CLOSE_DELAY_SECONDS", sVar.f32390d);
        intent.putExtra("DEC_DELAY_SECONDS", sVar.f32391e);
        Boolean bool2 = sVar.f32388b;
        if (bool2 != null) {
            intent.putExtra("SKIP_ENABLED", bool2.booleanValue());
        }
        intent.putExtra("SKIP_DELAY_SECONDS", sVar.f32389c);
        intent.putExtra("AUTO_STORE_ON_SKIP", sVar.f32392f);
        intent.putExtra("AUTO_STORE_ON_COMPLETE", sVar.f32393g);
        C1899m c1899m = sVar.f32395i;
        if (c1899m != null) {
            intent.putExtra("ANDROID_INLINE_ENABLED", c1899m.f28845a);
        }
        if (c1899m != null) {
            String value = c1899m.f28846b;
            AbstractC3340k.e(value, "value");
            intent.putExtra("ANDROID_INLINE_URL", value);
        }
        C1901o c1901o = sVar.f32396j;
        if (c1901o != null) {
            intent.putExtra("ANDROID_AUTOINLINE_ENABLED", true);
        }
        if (c1901o != null) {
            intent.putExtra("ANDROID_AUTOINLINE_SKIP", c1901o.f28849a);
        }
        if (c1901o != null) {
            String value2 = c1901o.f28850b;
            AbstractC3340k.e(value2, "value");
            intent.putExtra("ANDROID_AUTOINLINE_EVENTLINK", value2);
        }
        if (c1901o != null && (str = c1901o.f28851c) != null) {
            intent.putExtra("ANDROID_AUTOINLINE_CLICKTHROUGH", str);
        }
        if (c1901o != null && (bool = c1901o.f28852d) != null) {
            intent.putExtra("ANDROID_AUTOINLINE_FORCE_FULLSCREEN", bool.booleanValue());
        }
        String str2 = this.f31346c;
        if (str2 != null) {
            intent.putExtra("BUNDLE_ID", str2);
        }
        intent.setFlags(268435456);
        context.startActivity(intent);
        return C2515C.f34653a;
    }
}
