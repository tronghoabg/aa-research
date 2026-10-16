package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fso implements defpackage.fsn {
    private static final boolean b(int i, android.content.Context context) {
        try {
            return context.getResources().getResourceEntryName(i) != null;
        } catch (android.content.res.Resources.NotFoundException unused) {
        }
    }

    @Override // defpackage.fsn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, defpackage.ftm ftmVar) {
        int iIntValue = ((java.lang.Number) obj).intValue();
        android.content.Context context = ftmVar.a;
        if (!b(iIntValue, context)) {
            return null;
        }
        android.net.Uri uri = android.net.Uri.parse("android.resource://" + context.getPackageName() + "/" + iIntValue);
        uri.getClass();
        return uri;
    }
}
