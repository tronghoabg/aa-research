package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wpo extends defpackage.mr {
    public final android.view.View s;

    public wpo(android.view.View view, byte[] bArr) {
        super(view);
        this.s = (android.widget.TextView) view.findViewById(com.google.android.projection.gearhead.R.id.license);
    }

    public wpo(android.view.View view) {
        super(view);
        this.s = view;
    }

    public wpo(android.widget.TextView textView) {
        super(textView);
        this.s = textView;
    }
}
