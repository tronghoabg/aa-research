package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class kwr extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        throw new java.lang.RuntimeException("Test crash via broadcast");
    }
}
