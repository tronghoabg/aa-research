package androidx.browser.trusted;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface TokenStore {
    Token load();

    void store(Token token);
}
