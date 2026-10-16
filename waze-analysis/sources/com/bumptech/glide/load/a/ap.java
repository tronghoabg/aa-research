package com.bumptech.glide.load.a;

import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ap implements Appendable {

    /* renamed from: a, reason: collision with root package name */
    private final Appendable f3035a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3036b = true;

    ap(Appendable appendable) {
        this.f3035a = appendable;
    }

    private static final CharSequence a(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i2, int i3) throws IOException {
        boolean z = false;
        if (this.f3036b) {
            this.f3036b = false;
            this.f3035a.append("  ");
        }
        CharSequence charSequenceA = a(charSequence);
        if (charSequenceA.length() > 0 && charSequenceA.charAt(i3 - 1) == '\n') {
            z = true;
        }
        this.f3036b = z;
        this.f3035a.append(charSequenceA, i2, i3);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) throws IOException {
        CharSequence charSequenceA = a(charSequence);
        append(charSequenceA, 0, charSequenceA.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c2) throws IOException {
        if (this.f3036b) {
            this.f3036b = false;
            this.f3035a.append("  ");
        }
        this.f3036b = c2 == '\n';
        this.f3035a.append(c2);
        return this;
    }
}
