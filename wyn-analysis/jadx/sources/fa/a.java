package Fa;

import Ca.h;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.text.latin.ModuleDescriptor;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import r7.C3934d;
import ya.g;

/* loaded from: classes4.dex */
public final class a implements h {

    /* renamed from: c, reason: collision with root package name */
    public static final a f4033c = new a();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f4034a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    public final String f4035b = "taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile";

    @Override // Ca.h
    public final String a() {
        return true != c() ? "play-services-mlkit-text-recognition" : "text-recognition";
    }

    @Override // Ca.h
    public final String b() {
        return this.f4035b;
    }

    @Override // Ca.h
    public final boolean c() {
        AtomicReference atomicReference = this.f4034a;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean z2 = C3934d.a(g.c().b(), ModuleDescriptor.MODULE_ID) > 0;
        atomicReference.set(Boolean.valueOf(z2));
        return z2;
    }

    @Override // Ca.h
    public final int d() {
        return c() ? 24317 : 24306;
    }

    @Override // Ca.h
    public final String e() {
        return true != c() ? "com.google.android.gms.vision.ocr" : ModuleDescriptor.MODULE_ID;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        ((a) obj).getClass();
        return AbstractC1732v.m(null, null);
    }

    @Override // Ca.h
    public final Executor f() {
        return null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null});
    }
}
