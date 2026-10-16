package com.google.e.a.j;

import j$.util.Objects;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Mac;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ac extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ad f8663a;

    ac(ad adVar) {
        Objects.requireNonNull(adVar);
        this.f8663a = adVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() throws InvalidKeyException {
        try {
            v vVar = v.f8759b;
            ad adVar = this.f8663a;
            Mac mac = (Mac) vVar.a(adVar.f8665b);
            mac.init(adVar.f8666c);
            return mac;
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
