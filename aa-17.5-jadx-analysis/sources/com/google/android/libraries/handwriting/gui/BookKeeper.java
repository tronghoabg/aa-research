package com.google.android.libraries.handwriting.gui;

import android.util.Log;
import com.google.android.libraries.handwriting.base.LogV;
import com.google.android.libraries.handwriting.base.RecognitionResult;
import defpackage.a;
import java.text.StringCharacterIterator;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes3.dex */
public class BookKeeper {
    private static final String TAG = "HWRBookKeeper";
    private final LinkedList<RecognizedCharacter> book = new LinkedList<>();
    private String lastInkHash = null;

    public static class RecognitionResultAndSelectedText {
        public static final RecognitionResultAndSelectedText EMPTY = new RecognitionResultAndSelectedText(RecognitionResult.EMPTY, "");
        public final RecognitionResult recognitionResult;
        public final String selectedWord;

        public RecognitionResultAndSelectedText(RecognitionResult recognitionResult, String str) {
            this.recognitionResult = recognitionResult;
            this.selectedWord = str;
        }

        public String toString() {
            return "RecognitionResult: " + String.valueOf(this.recognitionResult) + " selectedWord: " + this.selectedWord;
        }
    }

    public static class RecognizedCharacter {
        final char character;
        final RecognitionResultAndSelectedText request;

        public RecognizedCharacter(char c, RecognitionResultAndSelectedText recognitionResultAndSelectedText) {
            this.character = c;
            this.request = recognitionResultAndSelectedText;
        }

        public String toString() {
            return "char: '" + this.character + "' request:" + this.request + "\n";
        }
    }

    private LinkedList<RecognizedCharacter> decomposeIntoCharacters(String str, RecognitionResultAndSelectedText recognitionResultAndSelectedText) {
        LinkedList<RecognizedCharacter> linkedList = new LinkedList<>();
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator(str);
        for (char cFirst = stringCharacterIterator.first(); cFirst != 65535; cFirst = stringCharacterIterator.next()) {
            linkedList.add(new RecognizedCharacter(cFirst, recognitionResultAndSelectedText));
        }
        return linkedList;
    }

    private void deleteFromBook(int i, int i2) {
        LogV.i(2, "HWRBookKeeper.deleteFromBook", String.format("startPosition=%s stopPosition=%s contents=%s", Integer.valueOf(i), Integer.valueOf(i2), contentsAsString()));
        for (int i3 = i; i3 < i2; i3++) {
            if (i >= 0 && i < this.book.size()) {
                this.book.remove(i);
            }
        }
    }

    public void clear() {
        this.book.clear();
    }

    public String contentsAsString() {
        StringBuilder sb = new StringBuilder();
        Iterator<RecognizedCharacter> it = this.book.iterator();
        while (it.hasNext()) {
            sb.append(it.next().character);
        }
        return sb.toString();
    }

    public RecognitionResultAndSelectedText getBookkeepingEntry(int i) {
        LogV.i(3, TAG, a.bp(i, "getBookkeepingEntry: "));
        return (i < 0 || this.book.size() <= i) ? RecognitionResultAndSelectedText.EMPTY : this.book.get(i).request;
    }

    public RecognitionResultAndSelectedText getLastEntry() {
        if (this.book.isEmpty()) {
            return null;
        }
        return this.book.getLast().request;
    }

    public void init(CharSequence charSequence) {
        clear();
        update(0, 0, charSequence.toString(), RecognitionResult.EMPTY);
    }

    public CharSequence lastHash() {
        String str = this.lastInkHash;
        return str == null ? "null" : str;
    }

    public void logState() {
        Log.i(TAG, "Full content of the field:\n'" + contentsAsString() + "'");
        Iterator<RecognizedCharacter> it = this.book.iterator();
        while (it.hasNext()) {
            Log.i(TAG, "RecognizedCharacter: ".concat(String.valueOf(String.valueOf(it.next()))));
        }
    }

    public int size() {
        return this.book.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055 A[Catch: all -> 0x0074, TryCatch #0 {, blocks: (B:6:0x0006, B:7:0x000e, B:9:0x003c, B:11:0x0042, B:12:0x004a, B:14:0x0055, B:16:0x0067, B:18:0x006d, B:15:0x0062), top: B:26:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062 A[Catch: all -> 0x0074, TryCatch #0 {, blocks: (B:6:0x0006, B:7:0x000e, B:9:0x003c, B:11:0x0042, B:12:0x004a, B:14:0x0055, B:16:0x0067, B:18:0x006d, B:15:0x0062), top: B:26:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #0 {, blocks: (B:6:0x0006, B:7:0x000e, B:9:0x003c, B:11:0x0042, B:12:0x004a, B:14:0x0055, B:16:0x0067, B:18:0x006d, B:15:0x0062), top: B:26:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void update(int r4, int r5, java.lang.String r6, com.google.android.libraries.handwriting.base.RecognitionResult r7) {
        /*
            r3 = this;
            java.lang.String r0 = "startPosition="
            monitor-enter(r3)
            r1 = 1
            if (r4 >= 0) goto Le
            java.lang.String r4 = "HWRBookKeeper"
            java.lang.String r2 = "Strange: startposition < 0"
            com.google.android.libraries.handwriting.base.LogV.i(r1, r4, r2)     // Catch: java.lang.Throwable -> L74
            r4 = 0
        Le:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L74
            r2.append(r4)     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = " stopPosition="
            r2.append(r0)     // Catch: java.lang.Throwable -> L74
            r2.append(r5)     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = " text="
            r2.append(r0)     // Catch: java.lang.Throwable -> L74
            r2.append(r6)     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L74
            java.lang.String r2 = "HWRBookKeeper.update"
            com.google.android.libraries.handwriting.base.LogV.i(r1, r2, r0)     // Catch: java.lang.Throwable -> L74
            com.google.android.libraries.handwriting.gui.BookKeeper$RecognitionResultAndSelectedText r0 = new com.google.android.libraries.handwriting.gui.BookKeeper$RecognitionResultAndSelectedText     // Catch: java.lang.Throwable -> L74
            r0.<init>(r7, r6)     // Catch: java.lang.Throwable -> L74
            java.util.LinkedList r6 = r3.decomposeIntoCharacters(r6, r0)     // Catch: java.lang.Throwable -> L74
            com.google.android.libraries.handwriting.base.RecognitionResult r7 = r0.recognitionResult     // Catch: java.lang.Throwable -> L74
            if (r7 == 0) goto L4a
            java.lang.String r7 = r7.getInkHash()     // Catch: java.lang.Throwable -> L74
            if (r7 == 0) goto L4a
            com.google.android.libraries.handwriting.base.RecognitionResult r7 = r0.recognitionResult     // Catch: java.lang.Throwable -> L74
            java.lang.String r7 = r7.getInkHash()     // Catch: java.lang.Throwable -> L74
            r3.lastInkHash = r7     // Catch: java.lang.Throwable -> L74
        L4a:
            r3.deleteFromBook(r4, r5)     // Catch: java.lang.Throwable -> L74
            java.util.LinkedList<com.google.android.libraries.handwriting.gui.BookKeeper$RecognizedCharacter> r5 = r3.book     // Catch: java.lang.Throwable -> L74
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L74
            if (r4 <= r5) goto L62
            java.lang.String r4 = "HWRBookKeeper"
            java.lang.String r5 = "Strange: startposition > book.size()"
            com.google.android.libraries.handwriting.base.LogV.i(r1, r4, r5)     // Catch: java.lang.Throwable -> L74
            java.util.LinkedList<com.google.android.libraries.handwriting.gui.BookKeeper$RecognizedCharacter> r4 = r3.book     // Catch: java.lang.Throwable -> L74
            r4.addAll(r6)     // Catch: java.lang.Throwable -> L74
            goto L67
        L62:
            java.util.LinkedList<com.google.android.libraries.handwriting.gui.BookKeeper$RecognizedCharacter> r5 = r3.book     // Catch: java.lang.Throwable -> L74
            r5.addAll(r4, r6)     // Catch: java.lang.Throwable -> L74
        L67:
            int r4 = com.google.android.libraries.handwriting.base.LogV.logVerbosity()     // Catch: java.lang.Throwable -> L74
            if (r4 <= 0) goto L72
            r3.logState()     // Catch: java.lang.Throwable -> L74
            monitor-exit(r3)
            return
        L72:
            monitor-exit(r3)
            return
        L74:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L74
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.handwriting.gui.BookKeeper.update(int, int, java.lang.String, com.google.android.libraries.handwriting.base.RecognitionResult):void");
    }
}
