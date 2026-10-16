package defpackage;

import java.text.BreakIterator;

/* loaded from: classes.dex */
public final class dgn extends dgl {
    private final CharSequence a;
    private final BreakIterator b;

    public dgn(CharSequence charSequence) {
        this.a = charSequence;
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.b = characterInstance;
    }

    @Override // defpackage.dgl
    public final int a(int i) {
        return this.b.following(i);
    }

    @Override // defpackage.dgl
    public final int d(int i) {
        return this.b.preceding(i);
    }
}
