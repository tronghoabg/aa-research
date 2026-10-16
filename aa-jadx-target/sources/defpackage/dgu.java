package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dgu extends defpackage.dgs {
    private final java.lang.CharSequence a;
    private final java.text.BreakIterator b;

    public dgu(java.lang.CharSequence charSequence) {
        this.a = charSequence;
        java.text.BreakIterator characterInstance = java.text.BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.b = characterInstance;
    }

    @Override // defpackage.dgs
    public final int a(int i) {
        return this.b.following(i);
    }

    @Override // defpackage.dgs
    public final int d(int i) {
        return this.b.preceding(i);
    }
}
