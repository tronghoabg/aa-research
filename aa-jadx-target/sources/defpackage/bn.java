package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class bn extends defpackage.pi {
    @Override // defpackage.pi
    public final /* synthetic */ java.lang.Object a(int i, android.content.Intent intent) {
        return new androidx.activity.result.ActivityResult(i, intent);
    }

    @Override // defpackage.pi
    public final /* bridge */ /* synthetic */ android.content.Intent b(java.lang.Object obj) {
        android.os.Bundle bundleExtra;
        androidx.activity.result.IntentSenderRequest intentSenderRequestA = (androidx.activity.result.IntentSenderRequest) obj;
        android.content.Intent intent = new android.content.Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        android.content.Intent intent2 = intentSenderRequestA.b;
        if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                ph phVar = new ph(intentSenderRequestA.a);
                phVar.a = null;
                phVar.b(intentSenderRequestA.d, intentSenderRequestA.c);
                intentSenderRequestA = phVar.a();
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", (android.os.Parcelable) intentSenderRequestA);
        if (defpackage.bt.ac(2)) {
            intent.toString();
            android.util.Log.v("FragmentManager", "CreateIntent created the following intent: ".concat(intent.toString()));
        }
        return intent;
    }
}
