package Yf;

import E5.Q;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class y extends u {

    /* renamed from: i, reason: collision with root package name */
    public String f16895i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16896j;

    @Override // Yf.u
    public final kotlinx.serialization.json.b K() {
        return new kotlinx.serialization.json.c((LinkedHashMap) this.f16884h);
    }

    @Override // Yf.u
    public final void N(String key, kotlinx.serialization.json.b element) {
        AbstractC3340k.e(key, "key");
        AbstractC3340k.e(element, "element");
        if (!this.f16896j) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f16884h;
            String str = this.f16895i;
            if (str == null) {
                AbstractC3340k.m("tag");
                throw null;
            }
            linkedHashMap.put(str, element);
            this.f16896j = true;
            return;
        }
        if (element instanceof kotlinx.serialization.json.d) {
            this.f16895i = ((kotlinx.serialization.json.d) element).a();
            this.f16896j = false;
        } else {
            if (element instanceof kotlinx.serialization.json.c) {
                throw r.b(Xf.u.f16295b);
            }
            if (!(element instanceof kotlinx.serialization.json.a)) {
                throw new Q((byte) 0, 9);
            }
            throw r.b(Xf.e.f16259b);
        }
    }
}
