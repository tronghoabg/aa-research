package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class wua extends defpackage.wuc {
    final /* synthetic */ android.content.Context a;
    final /* synthetic */ android.text.TextPaint b;
    final /* synthetic */ defpackage.wuc c;
    final /* synthetic */ defpackage.wub d;

    public wua(defpackage.wub wubVar, android.content.Context context, android.text.TextPaint textPaint, defpackage.wuc wucVar) {
        this.a = context;
        this.b = textPaint;
        this.c = wucVar;
        this.d = wubVar;
    }

    @Override // defpackage.wuc
    public final void a(int i) {
        this.c.a(i);
    }

    @Override // defpackage.wuc
    public final void b(android.graphics.Typeface typeface, boolean z) {
        this.d.e(this.a, this.b, typeface);
        this.c.b(typeface, z);
    }
}
