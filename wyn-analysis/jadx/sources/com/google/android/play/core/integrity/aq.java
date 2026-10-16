package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* loaded from: classes4.dex */
final class aq extends IntegrityTokenResponse {

    /* renamed from: a, reason: collision with root package name */
    private final String f27163a;

    /* renamed from: b, reason: collision with root package name */
    private final y f27164b;

    public aq(String str, y yVar) {
        this.f27163a = str;
        this.f27164b = yVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final Task<Integer> showDialog(Activity activity, int i5) {
        return this.f27164b.a(activity, i5);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f27163a;
    }
}
