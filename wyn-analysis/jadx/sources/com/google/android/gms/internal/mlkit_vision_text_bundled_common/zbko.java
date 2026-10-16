package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zbko {
    private final zbkm zba;

    private zbko(zbkm zbkmVar) {
        int i5 = zbkc.zbb;
        this.zba = zbkmVar;
    }

    public static zbko zba(String str) {
        return new zbko(new zbkm("#vk "));
    }

    public final List zbb(CharSequence charSequence) {
        charSequence.getClass();
        zbkl zbklVar = new zbkl(this.zba, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (zbklVar.hasNext()) {
            arrayList.add((String) zbklVar.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }
}
