package com.google.gson.internal.sql;

import com.google.gson.internal.bind.AbstractC1757c;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes4.dex */
public final class b extends AbstractC1757c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27506b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i5, Class cls) {
        super(cls);
        this.f27506b = i5;
    }

    @Override // com.google.gson.internal.bind.AbstractC1757c
    public final Date a(Date date) {
        switch (this.f27506b) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
