package com.google.d.d;

import j$.util.Objects;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class am extends v {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ao f7420a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f7421b;

    /* renamed from: c, reason: collision with root package name */
    private int f7422c;

    am(ao aoVar, int i2) {
        Objects.requireNonNull(aoVar);
        this.f7420a = aoVar;
        this.f7421b = aoVar.z(i2);
        this.f7422c = i2;
    }

    private final void a() {
        int i2 = this.f7422c;
        if (i2 != -1) {
            ao aoVar = this.f7420a;
            if (i2 < aoVar.size() && Objects.equals(this.f7421b, aoVar.z(this.f7422c))) {
                return;
            }
        }
        this.f7422c = this.f7420a.x(this.f7421b);
    }

    @Override // com.google.d.d.v, java.util.Map.Entry
    public final Object getKey() {
        return this.f7421b;
    }

    @Override // com.google.d.d.v, java.util.Map.Entry
    public final Object getValue() {
        ao aoVar = this.f7420a;
        Map mapM = aoVar.m();
        if (mapM != null) {
            return mapM.get(this.f7421b);
        }
        a();
        int i2 = this.f7422c;
        if (i2 == -1) {
            return null;
        }
        return aoVar.C(i2);
    }

    @Override // com.google.d.d.v, java.util.Map.Entry
    public final Object setValue(Object obj) {
        ao aoVar = this.f7420a;
        Map mapM = aoVar.m();
        if (mapM != null) {
            return mapM.put(this.f7421b, obj);
        }
        a();
        int i2 = this.f7422c;
        if (i2 == -1) {
            aoVar.put(this.f7421b, obj);
            return null;
        }
        Object objC = aoVar.C(i2);
        aoVar.E(this.f7422c, obj);
        return objC;
    }
}
