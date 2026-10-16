package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tlc extends defpackage.tks {
    private final defpackage.tlb b;

    public tlc(defpackage.tkv tkvVar, defpackage.tlb tlbVar) {
        super(tkvVar);
        this.b = tlbVar;
    }

    @Override // defpackage.tks
    public final void e(android.graphics.Canvas canvas, android.graphics.Paint paint) {
        float width = canvas.getWidth();
        float height = canvas.getHeight();
        float width2 = canvas.getWidth();
        float height2 = canvas.getHeight();
        float f = this.b.c;
        canvas.drawRoundRect(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, width, height, width2 * f, height2 * f, paint);
    }
}
