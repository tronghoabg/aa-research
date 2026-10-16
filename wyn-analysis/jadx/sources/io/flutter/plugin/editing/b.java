package io.flutter.plugin.editing;

import ad.L;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import kc.r;
import t6.q;
import uc.C4281r;

/* loaded from: classes5.dex */
public final class b extends BaseInputConnection implements d {

    /* renamed from: a, reason: collision with root package name */
    public final r f37025a;

    /* renamed from: b, reason: collision with root package name */
    public final int f37026b;

    /* renamed from: c, reason: collision with root package name */
    public final q f37027c;

    /* renamed from: d, reason: collision with root package name */
    public final e f37028d;

    /* renamed from: e, reason: collision with root package name */
    public final EditorInfo f37029e;

    /* renamed from: f, reason: collision with root package name */
    public ExtractedTextRequest f37030f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f37031g;

    /* renamed from: h, reason: collision with root package name */
    public CursorAnchorInfo.Builder f37032h;

    /* renamed from: i, reason: collision with root package name */
    public final ExtractedText f37033i;

    /* renamed from: j, reason: collision with root package name */
    public final InputMethodManager f37034j;
    public final DynamicLayout k;

    /* renamed from: l, reason: collision with root package name */
    public final L f37035l;

    /* renamed from: m, reason: collision with root package name */
    public final Dd.c f37036m;

    /* renamed from: n, reason: collision with root package name */
    public int f37037n;

    public b(r rVar, int i5, q qVar, Dd.c cVar, e eVar, EditorInfo editorInfo) {
        FlutterJNI flutterJNI = new FlutterJNI();
        super(rVar, true);
        this.f37031g = false;
        this.f37033i = new ExtractedText();
        this.f37037n = 0;
        this.f37025a = rVar;
        this.f37026b = i5;
        this.f37027c = qVar;
        this.f37028d = eVar;
        eVar.a(this);
        this.f37029e = editorInfo;
        this.f37036m = cVar;
        this.f37035l = new L(flutterJNI, 9);
        this.k = new DynamicLayout(eVar, new TextPaint(), com.google.android.gms.common.api.f.API_PRIORITY_OTHER, Layout.Alignment.ALIGN_NORMAL, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
        this.f37034j = (InputMethodManager) rVar.getContext().getSystemService("input_method");
    }

    @Override // io.flutter.plugin.editing.d
    public final void a(boolean z2) {
        e eVar = this.f37028d;
        eVar.getClass();
        this.f37034j.updateSelection(this.f37025a, Selection.getSelectionStart(eVar), Selection.getSelectionEnd(eVar), BaseInputConnection.getComposingSpanStart(eVar), BaseInputConnection.getComposingSpanEnd(eVar));
        ExtractedTextRequest extractedTextRequest = this.f37030f;
        InputMethodManager inputMethodManager = this.f37034j;
        r rVar = this.f37025a;
        if (extractedTextRequest != null) {
            inputMethodManager.updateExtractedText(rVar, extractedTextRequest.token, c(extractedTextRequest));
        }
        if (this.f37031g) {
            inputMethodManager.updateCursorAnchorInfo(rVar, b());
        }
    }

    public final CursorAnchorInfo b() {
        CursorAnchorInfo.Builder builder = this.f37032h;
        if (builder == null) {
            this.f37032h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        CursorAnchorInfo.Builder builder2 = this.f37032h;
        e eVar = this.f37028d;
        eVar.getClass();
        int selectionStart = Selection.getSelectionStart(eVar);
        eVar.getClass();
        builder2.setSelectionRange(selectionStart, Selection.getSelectionEnd(eVar));
        eVar.getClass();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(eVar);
        eVar.getClass();
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(eVar);
        if (composingSpanStart < 0 || composingSpanEnd <= composingSpanStart) {
            this.f37032h.setComposingText(-1, "");
        } else {
            this.f37032h.setComposingText(composingSpanStart, eVar.toString().subSequence(composingSpanStart, composingSpanEnd));
        }
        return this.f37032h.build();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        this.f37028d.b();
        this.f37037n++;
        return super.beginBatchEdit();
    }

    public final ExtractedText c(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.f37033i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        CharSequence string = this.f37028d;
        string.getClass();
        extractedText.selectionStart = Selection.getSelectionStart(string);
        string.getClass();
        extractedText.selectionEnd = Selection.getSelectionEnd(string);
        if (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) {
            string = string.toString();
        }
        extractedText.text = string;
        return extractedText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final void closeConnection() {
        super.closeConnection();
        this.f37028d.e(this);
        while (this.f37037n > 0) {
            endBatchEdit();
            this.f37037n--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i5, Bundle bundle) throws IOException {
        int i10;
        if (Build.VERSION.SDK_INT >= 25 && (i5 & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                if (inputContentInfo.getDescription().getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    Uri contentUri = inputContentInfo.getContentUri();
                    String mimeType = inputContentInfo.getDescription().getMimeType(0);
                    Context context = this.f37025a.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (inputStreamOpenInputStream != null) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[65536];
                                while (true) {
                                    try {
                                        i10 = inputStreamOpenInputStream.read(bArr);
                                    } catch (IOException unused) {
                                        i10 = -1;
                                    }
                                    if (i10 == -1) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        HashMap map = new HashMap();
                                        map.put("mimeType", mimeType);
                                        map.put(JsonStorageKeyNames.DATA_KEY, byteArray);
                                        map.put("uri", contentUri.toString());
                                        q qVar = this.f37027c;
                                        qVar.getClass();
                                        ((C4281r) qVar.f45906a).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(this.f37026b), "TextInputAction.commitContent", map), null);
                                        inputContentInfo.releasePermission();
                                        return true;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i10);
                                }
                            }
                        } catch (FileNotFoundException unused2) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (Exception unused3) {
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x028b, code lost:
    
        r14 = r14 + r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x003f A[ADDED_TO_REGION, EDGE_INSN: B:198:0x003f->B:18:0x003f BREAK  A[LOOP:2: B:63:0x00fe->B:201:?], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01ad A[ADDED_TO_REGION, EDGE_INSN: B:208:0x01ad->B:108:0x01ad BREAK  A[LOOP:4: B:143:0x0232->B:211:?], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0177 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.b.d(boolean, boolean):boolean");
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i5, int i10) {
        e eVar = this.f37028d;
        eVar.getClass();
        if (Selection.getSelectionStart(eVar) == -1) {
            return true;
        }
        return super.deleteSurroundingText(i5, i10);
    }

    public final boolean e(boolean z2, boolean z10) {
        e eVar = this.f37028d;
        int selectionStart = Selection.getSelectionStart(eVar);
        int selectionEnd = Selection.getSelectionEnd(eVar);
        boolean z11 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z10) {
            z11 = true;
        }
        beginBatchEdit();
        DynamicLayout dynamicLayout = this.k;
        if (z11) {
            if (z2) {
                Selection.moveUp(eVar, dynamicLayout);
            } else {
                Selection.moveDown(eVar, dynamicLayout);
            }
            int selectionStart2 = Selection.getSelectionStart(eVar);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z2) {
                Selection.extendUp(eVar, dynamicLayout);
            } else {
                Selection.extendDown(eVar, dynamicLayout);
            }
            setSelection(Selection.getSelectionStart(eVar), Selection.getSelectionEnd(eVar));
        }
        endBatchEdit();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        boolean zEndBatchEdit = super.endBatchEdit();
        this.f37037n--;
        this.f37028d.c();
        return zEndBatchEdit;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        return this.f37028d;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i5) {
        this.f37030f = (i5 & 1) != 0 ? extractedTextRequest : null;
        return c(extractedTextRequest);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i5) {
        beginBatchEdit();
        boolean z2 = true;
        e eVar = this.f37028d;
        if (i5 == 16908319) {
            setSelection(0, eVar.length());
        } else {
            r rVar = this.f37025a;
            if (i5 == 16908320) {
                int selectionStart = Selection.getSelectionStart(eVar);
                int selectionEnd = Selection.getSelectionEnd(eVar);
                if (selectionStart != selectionEnd) {
                    int iMin = Math.min(selectionStart, selectionEnd);
                    int iMax = Math.max(selectionStart, selectionEnd);
                    ((ClipboardManager) rVar.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", eVar.subSequence(iMin, iMax)));
                    eVar.delete(iMin, iMax);
                    setSelection(iMin, iMin);
                }
            } else if (i5 == 16908321) {
                int selectionStart2 = Selection.getSelectionStart(eVar);
                int selectionEnd2 = Selection.getSelectionEnd(eVar);
                if (selectionStart2 != selectionEnd2) {
                    ((ClipboardManager) rVar.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", eVar.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
                }
            } else if (i5 == 16908322) {
                ClipData primaryClip = ((ClipboardManager) rVar.getContext().getSystemService("clipboard")).getPrimaryClip();
                if (primaryClip != null) {
                    CharSequence charSequenceCoerceToText = primaryClip.getItemAt(0).coerceToText(rVar.getContext());
                    int iMax2 = Math.max(0, Selection.getSelectionStart(eVar));
                    int iMax3 = Math.max(0, Selection.getSelectionEnd(eVar));
                    int iMin2 = Math.min(iMax2, iMax3);
                    int iMax4 = Math.max(iMax2, iMax3);
                    if (iMin2 != iMax4) {
                        eVar.delete(iMin2, iMax4);
                    }
                    eVar.insert(iMin2, charSequenceCoerceToText);
                    int length = charSequenceCoerceToText.length() + iMin2;
                    setSelection(length, length);
                }
            } else {
                z2 = false;
            }
        }
        endBatchEdit();
        return z2;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i5) {
        int i10 = this.f37026b;
        q qVar = this.f37027c;
        if (i5 == 0) {
            qVar.getClass();
            ((C4281r) qVar.f45906a).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.unspecified"), null);
        } else if (i5 == 1) {
            qVar.getClass();
            ((C4281r) qVar.f45906a).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.newline"), null);
        } else if (i5 == 2) {
            qVar.getClass();
            ((C4281r) qVar.f45906a).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.go"), null);
        } else if (i5 == 3) {
            qVar.getClass();
            ((C4281r) qVar.f45906a).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.search"), null);
        } else if (i5 == 4) {
            qVar.getClass();
            ((C4281r) qVar.f45906a).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.send"), null);
        } else if (i5 == 5) {
            qVar.getClass();
            ((C4281r) qVar.f45906a).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.next"), null);
        } else if (i5 != 7) {
            qVar.getClass();
            ((C4281r) qVar.f45906a).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.done"), null);
        } else {
            qVar.getClass();
            ((C4281r) qVar.f45906a).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.previous"), null);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        q qVar = this.f37027c;
        qVar.getClass();
        HashMap map = new HashMap();
        map.put(HandleInvocationsFromAdViewer.KEY_ACTION, str);
        if (bundle != null) {
            HashMap map2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    map2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    map2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    map2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    map2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    map2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    map2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    map2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    map2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            map.put(JsonStorageKeyNames.DATA_KEY, map2);
        }
        ((C4281r) qVar.f45906a).a("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(this.f37026b), map), null);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i5) {
        if ((i5 & 1) != 0) {
            this.f37034j.updateCursorAnchorInfo(this.f37025a, b());
        }
        this.f37031g = (i5 & 2) != 0;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.f37036m.H(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i5) {
        beginBatchEdit();
        boolean zCommitText = charSequence.length() == 0 ? super.commitText(charSequence, i5) : super.setComposingText(charSequence, i5);
        endBatchEdit();
        return zCommitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setSelection(int i5, int i10) {
        beginBatchEdit();
        boolean selection = super.setSelection(i5, i10);
        endBatchEdit();
        return selection;
    }
}
