package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import com.applovin.impl.AbstractC1656p0;
import com.applovin.impl.r2;

/* loaded from: classes.dex */
public class s4 extends r2 {

    /* renamed from: n, reason: collision with root package name */
    private final AbstractC1656p0.a f22776n;

    /* renamed from: o, reason: collision with root package name */
    private final Context f22777o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f22778p;

    public s4(AbstractC1656p0.a aVar, boolean z2, Context context) {
        super(r2.c.RIGHT_DETAIL);
        this.f22776n = aVar;
        this.f22777o = context;
        this.f22644c = new SpannedString(aVar.a());
        this.f22778p = z2;
    }

    @Override // com.applovin.impl.r2
    public SpannedString f() {
        return new SpannedString(this.f22776n.a(this.f22777o));
    }

    @Override // com.applovin.impl.r2
    public boolean o() {
        return false;
    }

    @Override // com.applovin.impl.r2
    public boolean p() {
        Boolean boolB = this.f22776n.b(this.f22777o);
        if (boolB != null) {
            return boolB.equals(Boolean.valueOf(this.f22778p));
        }
        return false;
    }
}
