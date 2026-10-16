package com.bytedance.adsdk.oa;

import android.util.Pair;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class sy {
    private boolean uef = false;

    /* renamed from: oa, reason: collision with root package name */
    private final Set<Object> f24574oa = new uef();
    private final Map<String, com.bytedance.adsdk.oa.ivm.moa> yo = new HashMap();
    private final Comparator<Pair<String, Float>> moa = new Comparator<Pair<String, Float>>() { // from class: com.bytedance.adsdk.oa.sy.1
        @Override // java.util.Comparator
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float fFloatValue = ((Float) pair.second).floatValue();
            float fFloatValue2 = ((Float) pair2.second).floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    };

    public void uef(boolean z2) {
        this.uef = z2;
    }

    public void uef(String str, float f10) {
        if (this.uef) {
            com.bytedance.adsdk.oa.ivm.moa moaVar = this.yo.get(str);
            if (moaVar == null) {
                moaVar = new com.bytedance.adsdk.oa.ivm.moa();
                this.yo.put(str, moaVar);
            }
            moaVar.uef(f10);
            if (str.equals("__container")) {
                Iterator<Object> it = this.f24574oa.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}
