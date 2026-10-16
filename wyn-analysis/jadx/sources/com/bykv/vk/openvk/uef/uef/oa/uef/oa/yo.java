package com.bykv.vk.openvk.uef.uef.oa.uef.oa;

import android.content.Context;
import com.bykv.vk.openvk.uef.uef.uef.lw.uef;
import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class yo {
    public static final ConcurrentHashMap<String, oa> uef = new ConcurrentHashMap<>();

    public static synchronized void uef(Context context, com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar, uef.InterfaceC0032uef interfaceC0032uef) {
        if (yoVar == null) {
            return;
        }
        try {
            ConcurrentHashMap<String, oa> concurrentHashMap = uef;
            oa oaVar = concurrentHashMap.get(yoVar.bs());
            if (oaVar == null) {
                oaVar = new oa(context, yoVar);
                concurrentHashMap.put(yoVar.bs(), oaVar);
                yoVar.ivm();
                yoVar.bs();
            }
            oaVar.uef(interfaceC0032uef);
            yoVar.ivm();
            yoVar.bs();
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void uef(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar) {
        try {
            oa oaVarRemove = uef.remove(yoVar.bs());
            if (oaVarRemove != null) {
                oaVarRemove.uef(true);
            }
            yoVar.ivm();
            yoVar.bs();
        } catch (Throwable th) {
            throw th;
        }
    }
}
