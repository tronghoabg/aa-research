package com.moloco.sdk.acm.db;

import com.moloco.sdk.internal.publisher.H;
import java.util.ArrayList;
import java.util.List;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class c extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public Object f28355a;

    /* renamed from: b, reason: collision with root package name */
    public List f28356b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f28357c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f28358d;

    /* renamed from: e, reason: collision with root package name */
    public int f28359e;

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f28358d = obj;
        this.f28359e |= Integer.MIN_VALUE;
        return H.K(null, this);
    }
}
