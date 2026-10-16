package com.waze.sdk;

import android.text.TextUtils;
import j$.util.Objects;
import java.util.Comparator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class j implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f35389a;

    j(ae aeVar) {
        Objects.requireNonNull(aeVar);
        this.f35389a = aeVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ae aeVar = this.f35389a;
        au auVar = (au) obj;
        au auVar2 = (au) obj2;
        if (aeVar.f35219e != null) {
            if (TextUtils.equals(auVar.f35258a, aeVar.f35219e.T())) {
                return -1;
            }
            if (TextUtils.equals(auVar2.f35258a, aeVar.f35219e.T())) {
                return 1;
            }
        }
        long lastAppAuthorizedTimestamp = SdkConfiguration.getLastAppAuthorizedTimestamp(auVar.f35258a);
        long lastAppAuthorizedTimestamp2 = SdkConfiguration.getLastAppAuthorizedTimestamp(auVar2.f35258a);
        if (lastAppAuthorizedTimestamp < lastAppAuthorizedTimestamp2) {
            return 1;
        }
        if (lastAppAuthorizedTimestamp > lastAppAuthorizedTimestamp2) {
            return -1;
        }
        return auVar.f35259b.toLowerCase().compareTo(auVar2.f35259b.toLowerCase());
    }
}
