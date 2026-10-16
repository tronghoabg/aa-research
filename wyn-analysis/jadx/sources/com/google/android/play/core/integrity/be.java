package com.google.android.play.core.integrity;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
final class be extends i8.z {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f27187a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f27188b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(bn bnVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f27188b = bnVar;
        this.f27187a = context;
    }

    @Override // i8.z
    public final void b() throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        Context context = this.f27187a;
        TaskCompletionSource taskCompletionSource = this.f27188b.f27214d;
        i8.y yVar = i8.f.f36905a;
        try {
            packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
            applicationInfo = packageInfo.applicationInfo;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        int i5 = (applicationInfo != null && applicationInfo.enabled && i8.f.a(packageInfo.signatures)) ? packageInfo.versionCode : 0;
        taskCompletionSource.trySetResult(Integer.valueOf(i5));
    }
}
