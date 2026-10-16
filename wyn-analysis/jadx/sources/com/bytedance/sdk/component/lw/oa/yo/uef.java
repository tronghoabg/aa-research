package com.bytedance.sdk.component.lw.oa.yo;

import com.bytedance.sdk.component.lw.ab;
import com.bytedance.sdk.component.lw.dj;
import com.bytedance.sdk.component.lw.oib;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class uef<T> {

    /* renamed from: oa, reason: collision with root package name */
    private oib f25030oa;
    private yo uef;

    public uef(yo yoVar, oib oibVar) {
        this.uef = yoVar;
        this.f25030oa = oibVar;
    }

    public void uef(dj<T> djVar) {
        try {
            oib oibVar = this.f25030oa;
            if (oibVar != null) {
                oibVar.uef("success", this.uef);
            }
            String strOib = this.uef.oib();
            Map<String, List<yo>> mapCz = this.uef.ab().cz();
            List<yo> list = mapCz.get(strOib);
            if (list == null) {
                ab abVarIvm = this.uef.ivm();
                if (abVarIvm != null) {
                    abVarIvm.toString();
                    this.uef.bcc();
                    abVarIvm.uef(djVar);
                }
            } else {
                synchronized (list) {
                    try {
                        list.size();
                        for (yo yoVar : list) {
                            ab abVarIvm2 = yoVar.ivm();
                            if (abVarIvm2 != null) {
                                abVarIvm2.toString();
                                yoVar.bcc();
                                abVarIvm2.uef(djVar);
                            }
                        }
                        list.clear();
                        mapCz.remove(strOib);
                    } finally {
                    }
                }
            }
            oib oibVar2 = this.f25030oa;
            if (oibVar2 != null) {
                oibVar2.oa("success", this.uef);
            }
        } catch (Throwable unused) {
        }
    }

    public void uef(int i5, String str, Throwable th) {
        try {
            oib oibVar = this.f25030oa;
            if (oibVar != null) {
                oibVar.uef("failed", this.uef);
            }
            String strOib = this.uef.oib();
            Map<String, List<yo>> mapCz = this.uef.ab().cz();
            List<yo> list = mapCz.get(strOib);
            if (list == null) {
                ab abVarIvm = this.uef.ivm();
                if (abVarIvm != null) {
                    abVarIvm.uef(i5, str, th);
                }
            } else {
                synchronized (list) {
                    try {
                        Iterator<yo> it = list.iterator();
                        while (it.hasNext()) {
                            ab abVarIvm2 = it.next().ivm();
                            if (abVarIvm2 != null) {
                                abVarIvm2.toString();
                                abVarIvm2.uef(i5, str, th);
                            }
                        }
                        list.clear();
                        mapCz.remove(strOib);
                    } finally {
                    }
                }
            }
            oib oibVar2 = this.f25030oa;
            if (oibVar2 != null) {
                oibVar2.oa("failed", this.uef);
            }
        } catch (Throwable unused) {
        }
    }
}
