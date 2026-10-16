package com.fasterxml.jackson.core.json;

import androidx.autofill.HintConstants;
import androidx.credentials.provider.CredentialEntry;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class ReaderBasedJsonParser extends JsonParserBase {
    protected boolean _bufferRecyclable;
    protected final int _hashSeed;
    protected char[] _inputBuffer;
    protected int _nameStartCol;
    protected long _nameStartOffset;
    protected int _nameStartRow;
    protected Reader _reader;
    protected final CharsToNameCanonicalizer _symbols;
    protected boolean _tokenIncomplete;

    public ReaderBasedJsonParser(IOContext iOContext, int i2, Reader reader, ObjectCodec objectCodec, CharsToNameCanonicalizer charsToNameCanonicalizer, char[] cArr, int i3, int i4, boolean z) {
        super(iOContext, i2, objectCodec);
        this._reader = null;
        this._inputBuffer = cArr;
        this._inputPtr = i3;
        this._inputEnd = i4;
        this._currInputRowStart = i3;
        this._currInputProcessed = -i3;
        this._symbols = charsToNameCanonicalizer;
        this._hashSeed = charsToNameCanonicalizer.hashSeed();
        this._bufferRecyclable = z;
    }

    private final void _checkMatchEnd(String str, int i2, int i3) {
        if (Character.isJavaIdentifierPart((char) i3)) {
            _reportInvalidToken(str.substring(0, i2));
        }
    }

    private void _closeScope(int i2) {
        if (i2 == 93) {
            _updateLocation();
            if (!this._parsingContext.inArray()) {
                _reportMismatchedEndMarker(93, '}');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            _updateToken(JsonToken.END_ARRAY);
            return;
        }
        if (i2 == 125) {
            _updateLocation();
            if (!this._parsingContext.inObject()) {
                _reportMismatchedEndMarker(125, ']');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            _updateToken(JsonToken.END_OBJECT);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String _handleOddName2(int r6, int r7, int[] r8) {
        /*
            r5 = this;
            char[] r0 = r5._inputBuffer
            int r1 = r5._inputPtr
            int r1 = r1 - r6
            com.fasterxml.jackson.core.util.TextBuffer r2 = r5._textBuffer
            r2.resetWithShared(r0, r6, r1)
            com.fasterxml.jackson.core.util.TextBuffer r6 = r5._textBuffer
            char[] r0 = r6.getCurrentSegment()
            int r6 = r6.getCurrentSegmentSize()
            int r1 = r8.length
        L15:
            int r2 = r5._inputPtr
            int r3 = r5._inputEnd
            if (r2 < r3) goto L22
            boolean r2 = r5._loadMore()
            if (r2 != 0) goto L22
            goto L35
        L22:
            char[] r2 = r5._inputBuffer
            int r3 = r5._inputPtr
            char r2 = r2[r3]
            if (r2 >= r1) goto L2f
            r3 = r8[r2]
            if (r3 != 0) goto L35
            goto L4f
        L2f:
            boolean r3 = java.lang.Character.isJavaIdentifierPart(r2)
            if (r3 != 0) goto L4f
        L35:
            com.fasterxml.jackson.core.util.TextBuffer r8 = r5._textBuffer
            r8.setCurrentLength(r6)
            com.fasterxml.jackson.core.util.TextBuffer r6 = r5._textBuffer
            com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer r5 = r5._symbols
            char[] r8 = r6.getTextBuffer()
            int r0 = r6.getTextOffset()
            int r6 = r6.size()
            java.lang.String r5 = r5.findSymbol(r8, r0, r6, r7)
            return r5
        L4f:
            int r3 = r5._inputPtr
            int r3 = r3 + 1
            r5._inputPtr = r3
            int r7 = r7 * 33
            int r3 = r6 + 1
            r0[r6] = r2
            int r6 = r0.length
            if (r3 < r6) goto L69
            com.fasterxml.jackson.core.util.TextBuffer r6 = r5._textBuffer
            char[] r6 = r6.finishCurrentSegment()
            r0 = 0
            r4 = r0
            r0 = r6
            r6 = r4
            goto L6a
        L69:
            r6 = r3
        L6a:
            int r7 = r7 + r2
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._handleOddName2(int, int, int[]):java.lang.String");
    }

    private final void _isNextTokenNameYes(int i2) {
        _updateToken(JsonToken.FIELD_NAME);
        _updateLocation();
        if (i2 == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return;
        }
        if (i2 == 43) {
            if (isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
                this._nextToken = _parseSignedNumber(false);
                return;
            } else {
                this._nextToken = _handleOddValue(i2);
                return;
            }
        }
        if (i2 == 91) {
            this._nextToken = JsonToken.START_ARRAY;
            return;
        }
        if (i2 == 102) {
            _matchToken(CredentialEntry.FALSE_STRING, 1);
            this._nextToken = JsonToken.VALUE_FALSE;
            return;
        }
        if (i2 == 110) {
            _matchToken("null", 1);
            this._nextToken = JsonToken.VALUE_NULL;
            return;
        }
        if (i2 == 116) {
            _matchToken(CredentialEntry.TRUE_STRING, 1);
            this._nextToken = JsonToken.VALUE_TRUE;
            return;
        }
        if (i2 == 123) {
            this._nextToken = JsonToken.START_OBJECT;
            return;
        }
        if (i2 == 45) {
            this._nextToken = _parseSignedNumber(true);
            return;
        }
        if (i2 == 46) {
            this._nextToken = _parseFloatThatStartsWithPeriod(false);
            return;
        }
        switch (i2) {
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                this._nextToken = _parseUnsignedNumber(i2);
                break;
            default:
                this._nextToken = _handleOddValue(i2);
                break;
        }
    }

    private final void _matchFalse() {
        int i2;
        char c2;
        int i3 = this._inputPtr;
        if (i3 + 4 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            if (cArr[i3] == 'a' && cArr[i3 + 1] == 'l' && cArr[i3 + 2] == 's' && cArr[i3 + 3] == 'e' && ((c2 = cArr[(i2 = i3 + 4)]) < '0' || c2 == ']' || c2 == '}')) {
                this._inputPtr = i2;
                return;
            }
        }
        _matchToken(CredentialEntry.FALSE_STRING, 1);
    }

    private final void _matchNull() {
        int i2;
        char c2;
        int i3 = this._inputPtr;
        if (i3 + 3 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            if (cArr[i3] == 'u' && cArr[i3 + 1] == 'l' && cArr[i3 + 2] == 'l' && ((c2 = cArr[(i2 = i3 + 3)]) < '0' || c2 == ']' || c2 == '}')) {
                this._inputPtr = i2;
                return;
            }
        }
        _matchToken("null", 1);
    }

    private final void _matchToken2(String str, int i2) {
        int length;
        int i3;
        char c2;
        do {
            if ((this._inputPtr >= this._inputEnd && !_loadMore()) || this._inputBuffer[this._inputPtr] != str.charAt(i2)) {
                _reportInvalidToken(str.substring(0, i2));
            }
            length = str.length();
            i3 = this._inputPtr + 1;
            this._inputPtr = i3;
            i2++;
        } while (i2 < length);
        if ((i3 < this._inputEnd || _loadMore()) && (c2 = this._inputBuffer[this._inputPtr]) >= '0' && c2 != ']' && c2 != '}') {
            _checkMatchEnd(str, i2, c2);
        }
    }

    private final void _matchTrue() {
        int i2;
        char c2;
        int i3 = this._inputPtr;
        if (i3 + 3 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            if (cArr[i3] == 'r' && cArr[i3 + 1] == 'u' && cArr[i3 + 2] == 'e' && ((c2 = cArr[(i2 = i3 + 3)]) < '0' || c2 == ']' || c2 == '}')) {
                this._inputPtr = i2;
                return;
            }
        }
        _matchToken(CredentialEntry.TRUE_STRING, 1);
    }

    private final JsonToken _nextAfterName() {
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        if (jsonToken == JsonToken.START_ARRAY) {
            createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        _updateToken(jsonToken);
        return jsonToken;
    }

    private final JsonToken _nextTokenNotInObject(int i2) {
        if (i2 == 34) {
            this._tokenIncomplete = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            _updateToken(jsonToken);
            return jsonToken;
        }
        if (i2 == 91) {
            createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            _updateToken(jsonToken2);
            return jsonToken2;
        }
        if (i2 == 102) {
            _matchToken(CredentialEntry.FALSE_STRING, 1);
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            _updateToken(jsonToken3);
            return jsonToken3;
        }
        if (i2 == 110) {
            _matchToken("null", 1);
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            _updateToken(jsonToken4);
            return jsonToken4;
        }
        if (i2 == 116) {
            _matchToken(CredentialEntry.TRUE_STRING, 1);
            JsonToken jsonToken5 = JsonToken.VALUE_TRUE;
            _updateToken(jsonToken5);
            return jsonToken5;
        }
        if (i2 == 123) {
            createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken6 = JsonToken.START_OBJECT;
            _updateToken(jsonToken6);
            return jsonToken6;
        }
        switch (i2) {
            case 44:
                if (!this._parsingContext.inRoot() && (this._features & FEAT_MASK_ALLOW_MISSING) != 0) {
                    this._inputPtr--;
                    JsonToken jsonToken7 = JsonToken.VALUE_NULL;
                    _updateToken(jsonToken7);
                    return jsonToken7;
                }
                break;
            case 45:
                JsonToken jsonToken_parseSignedNumber = _parseSignedNumber(true);
                _updateToken(jsonToken_parseSignedNumber);
                return jsonToken_parseSignedNumber;
            case 46:
                JsonToken jsonToken_parseFloatThatStartsWithPeriod = _parseFloatThatStartsWithPeriod(false);
                _updateToken(jsonToken_parseFloatThatStartsWithPeriod);
                return jsonToken_parseFloatThatStartsWithPeriod;
            default:
                switch (i2) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        JsonToken jsonToken_parseUnsignedNumber = _parseUnsignedNumber(i2);
                        _updateToken(jsonToken_parseUnsignedNumber);
                        return jsonToken_parseUnsignedNumber;
                }
        }
        JsonToken jsonToken_handleOddValue = _handleOddValue(i2);
        _updateToken(jsonToken_handleOddValue);
        return jsonToken_handleOddValue;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v13 ??, r10v2 ??, r10v7 ??, r10v6 ??, r10v5 ??, r10v10 ??, r10v9 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    private final com.fasterxml.jackson.core.JsonToken _parseFloat(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v13 ??, r10v2 ??, r10v7 ??, r10v6 ??, r10v5 ??, r10v10 ??, r10v9 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    private String _parseName2(int i2, int i3, int i4) {
        this._textBuffer.resetWithShared(this._inputBuffer, i2, this._inputPtr - i2);
        TextBuffer textBuffer = this._textBuffer;
        char[] currentSegment = textBuffer.getCurrentSegment();
        int currentSegmentSize = textBuffer.getCurrentSegmentSize();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            char[] cArr = this._inputBuffer;
            int i5 = this._inputPtr;
            this._inputPtr = i5 + 1;
            char c_decodeEscaped = cArr[i5];
            if (c_decodeEscaped <= '\\') {
                if (c_decodeEscaped == '\\') {
                    c_decodeEscaped = _decodeEscaped();
                } else if (c_decodeEscaped <= i4) {
                    if (c_decodeEscaped == i4) {
                        this._textBuffer.setCurrentLength(currentSegmentSize);
                        TextBuffer textBuffer2 = this._textBuffer;
                        return this._symbols.findSymbol(textBuffer2.getTextBuffer(), textBuffer2.getTextOffset(), textBuffer2.size(), i3);
                    }
                    if (c_decodeEscaped < ' ') {
                        _throwUnquotedSpace(c_decodeEscaped, HintConstants.AUTOFILL_HINT_NAME);
                    }
                }
            }
            int i6 = i3 * 33;
            int i7 = currentSegmentSize + 1;
            currentSegment[currentSegmentSize] = c_decodeEscaped;
            if (i7 >= currentSegment.length) {
                currentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            } else {
                currentSegmentSize = i7;
            }
            i3 = i6 + c_decodeEscaped;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:86:0x0145
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.fasterxml.jackson.core.JsonToken _parseNumber2(boolean r18, int r19) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._parseNumber2(boolean, int):com.fasterxml.jackson.core.JsonToken");
    }

    private final JsonToken _parseSignedNumber(boolean z) {
        int i2 = this._inputPtr;
        int i3 = z ? i2 - 1 : i2;
        int i4 = this._inputEnd;
        if (i2 >= i4) {
            return _parseNumber2(z, i3);
        }
        int i5 = i2 + 1;
        char c2 = this._inputBuffer[i2];
        char c3 = '9';
        int i6 = 1;
        if (c2 > '9' || c2 < '0') {
            this._inputPtr = i5;
            return c2 == '.' ? _parseFloatThatStartsWithPeriod(z) : _handleInvalidNumberStart(c2, z, true);
        }
        if (c2 == '0') {
            return _parseNumber2(z, i3);
        }
        while (i5 < i4) {
            char c4 = c3;
            int i7 = i5 + 1;
            char c5 = this._inputBuffer[i5];
            if (c5 < '0' || c5 > c4) {
                if (c5 == '.' || (c5 | ' ') == 101) {
                    this._inputPtr = i7;
                    return _parseFloat(c5, i3, i7, z, i6);
                }
                this._inputPtr = i5;
                if (this._parsingContext.inRoot()) {
                    _verifyRootSpace(c5);
                }
                this._textBuffer.resetWithShared(this._inputBuffer, i3, i5 - i3);
                return resetInt(z, i6);
            }
            i6++;
            i5 = i7;
            c3 = c4;
        }
        return _parseNumber2(z, i3);
    }

    private final int _skipAfterComma2() throws JsonParseException {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                throw _constructError("Unexpected end-of-input within/between " + this._parsingContext.typeDesc() + " entries");
            }
            char[] cArr = this._inputBuffer;
            int i2 = this._inputPtr;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            char c2 = cArr[i2];
            if (c2 > ' ') {
                if (c2 == '/') {
                    _skipComment();
                } else {
                    if (c2 != '#') {
                        return c2;
                    }
                    if (!_skipYAMLComment()) {
                        return 35;
                    }
                }
            } else if (c2 < ' ') {
                if (c2 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                } else if (c2 == '\r') {
                    _skipCR();
                } else if (c2 != '\t') {
                    _throwInvalidSpace(c2);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        _reportInvalidEOF(" in a comment", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void _skipCComment() {
        /*
            r3 = this;
        L0:
            int r0 = r3._inputPtr
            int r1 = r3._inputEnd
            if (r0 < r1) goto Lc
            boolean r0 = r3._loadMore()
            if (r0 == 0) goto L26
        Lc:
            char[] r0 = r3._inputBuffer
            int r1 = r3._inputPtr
            int r2 = r1 + 1
            r3._inputPtr = r2
            char r0 = r0[r1]
            r1 = 42
            if (r0 > r1) goto L0
            if (r0 != r1) goto L3c
            int r0 = r3._inputEnd
            if (r2 < r0) goto L2d
            boolean r0 = r3._loadMore()
            if (r0 != 0) goto L2d
        L26:
            java.lang.String r0 = " in a comment"
            r1 = 0
            r3._reportInvalidEOF(r0, r1)
            return
        L2d:
            char[] r0 = r3._inputBuffer
            int r1 = r3._inputPtr
            char r0 = r0[r1]
            r2 = 47
            if (r0 != r2) goto L0
            int r1 = r1 + 1
            r3._inputPtr = r1
            return
        L3c:
            r1 = 32
            if (r0 >= r1) goto L0
            r1 = 10
            if (r0 != r1) goto L4d
            int r0 = r3._currInputRow
            int r0 = r0 + 1
            r3._currInputRow = r0
            r3._currInputRowStart = r2
            goto L0
        L4d:
            r1 = 13
            if (r0 != r1) goto L55
            r3._skipCR()
            goto L0
        L55:
            r1 = 9
            if (r0 == r1) goto L0
            r3._throwInvalidSpace(r0)
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipCComment():void");
    }

    private final int _skipColon() {
        int i2;
        char c2;
        int i3 = this._inputPtr;
        if (i3 + 4 >= this._inputEnd) {
            return _skipColon2(false);
        }
        char[] cArr = this._inputBuffer;
        char c3 = cArr[i3];
        if (c3 == ':') {
            i2 = i3 + 1;
            this._inputPtr = i2;
            c2 = cArr[i2];
            if (c2 <= ' ') {
                if (c2 == ' ' || c2 == '\t') {
                    i2 = i3 + 2;
                    this._inputPtr = i2;
                    c2 = cArr[i2];
                    if (c2 > ' ') {
                        if (c2 == '/' || c2 == '#') {
                            return _skipColon2(true);
                        }
                    }
                }
                return _skipColon2(true);
            }
            if (c2 == '/' || c2 == '#') {
                return _skipColon2(true);
            }
        } else {
            if (c3 == ' ' || c3 == '\t') {
                i3++;
                this._inputPtr = i3;
                c3 = cArr[i3];
            }
            if (c3 != ':') {
                return _skipColon2(false);
            }
            i2 = i3 + 1;
            this._inputPtr = i2;
            c2 = cArr[i2];
            if (c2 <= ' ') {
                if (c2 == ' ' || c2 == '\t') {
                    i2 = i3 + 2;
                    this._inputPtr = i2;
                    c2 = cArr[i2];
                    if (c2 > ' ') {
                        if (c2 == '/' || c2 == '#') {
                            return _skipColon2(true);
                        }
                    }
                }
                return _skipColon2(true);
            }
            if (c2 == '/' || c2 == '#') {
                return _skipColon2(true);
            }
        }
        this._inputPtr = i2 + 1;
        return c2;
    }

    private final int _skipColon2(boolean z) {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" within/between " + this._parsingContext.typeDesc() + " entries", null);
                return -1;
            }
            char[] cArr = this._inputBuffer;
            int i2 = this._inputPtr;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            char c2 = cArr[i2];
            if (c2 > ' ') {
                if (c2 == '/') {
                    _skipComment();
                } else {
                    if (c2 == '#') {
                        if (_skipYAMLComment()) {
                            continue;
                        } else {
                            c2 = '#';
                        }
                    }
                    if (z) {
                        return c2;
                    }
                    if (c2 != ':') {
                        _reportUnexpectedChar(c2, "was expecting a colon to separate field name and value");
                    }
                    z = true;
                }
            } else if (c2 < ' ') {
                if (c2 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                } else if (c2 == '\r') {
                    _skipCR();
                } else if (c2 != '\t') {
                    _throwInvalidSpace(c2);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r2 != '#') goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int _skipColonFast(int r10) {
        /*
            r9 = this;
            char[] r0 = r9._inputBuffer
            char r1 = r0[r10]
            int r2 = r10 + 1
            r3 = 9
            r4 = 35
            r5 = 47
            r6 = 32
            r7 = 1
            r8 = 58
            if (r1 != r8) goto L38
            int r1 = r10 + 2
            char r2 = r0[r2]
            if (r2 <= r6) goto L1e
            if (r2 == r5) goto L2f
            if (r2 != r4) goto L65
            goto L2f
        L1e:
            if (r2 == r6) goto L22
            if (r2 != r3) goto L2f
        L22:
            int r10 = r10 + 3
            char r2 = r0[r1]
            if (r2 <= r6) goto L2e
            if (r2 == r5) goto L2e
            if (r2 == r4) goto L2e
        L2c:
            r1 = r10
            goto L65
        L2e:
            r1 = r10
        L2f:
            int r1 = r1 + (-1)
            r9._inputPtr = r1
            int r9 = r9._skipColon2(r7)
            return r9
        L38:
            if (r1 == r6) goto L3c
            if (r1 != r3) goto L41
        L3c:
            int r10 = r10 + 2
            char r1 = r0[r2]
            r2 = r10
        L41:
            if (r1 != r8) goto L44
            goto L45
        L44:
            r7 = 0
        L45:
            if (r7 == 0) goto L69
            int r1 = r2 + 1
            char r10 = r0[r2]
            if (r10 <= r6) goto L53
            if (r10 == r5) goto L58
            if (r10 == r4) goto L58
            r2 = r10
            goto L65
        L53:
            if (r10 == r6) goto L5a
            if (r10 != r3) goto L58
            goto L5a
        L58:
            r2 = r1
            goto L69
        L5a:
            int r10 = r2 + 2
            char r2 = r0[r1]
            if (r2 <= r6) goto L68
            if (r2 == r5) goto L68
            if (r2 == r4) goto L68
            goto L2c
        L65:
            r9._inputPtr = r1
            return r2
        L68:
            r2 = r10
        L69:
            int r2 = r2 + (-1)
            r9._inputPtr = r2
            int r9 = r9._skipColon2(r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipColonFast(int):int");
    }

    private final int _skipComma(int i2) {
        if (i2 != 44) {
            _reportUnexpectedChar(i2, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
        }
        while (true) {
            int i3 = this._inputPtr;
            if (i3 >= this._inputEnd) {
                return _skipAfterComma2();
            }
            char[] cArr = this._inputBuffer;
            int i4 = i3 + 1;
            this._inputPtr = i4;
            char c2 = cArr[i3];
            if (c2 > ' ') {
                if (c2 != '/' && c2 != '#') {
                    return c2;
                }
                this._inputPtr = i3;
                return _skipAfterComma2();
            }
            if (c2 < ' ') {
                if (c2 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i4;
                } else if (c2 == '\r') {
                    _skipCR();
                } else if (c2 != '\t') {
                    _throwInvalidSpace(c2);
                }
            }
        }
    }

    private void _skipComment() {
        if ((this._features & FEAT_MASK_ALLOW_JAVA_COMMENTS) == 0) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in a comment", null);
        }
        char[] cArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        char c2 = cArr[i2];
        if (c2 == '/') {
            _skipLine();
        } else if (c2 == '*') {
            _skipCComment();
        } else {
            _reportUnexpectedChar(c2, "was expecting either '*' or '/' for a comment");
        }
    }

    private void _skipLine() {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return;
            }
            char[] cArr = this._inputBuffer;
            int i2 = this._inputPtr;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            char c2 = cArr[i2];
            if (c2 < ' ') {
                if (c2 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                    return;
                } else if (c2 == '\r') {
                    _skipCR();
                    return;
                } else if (c2 != '\t') {
                    _throwInvalidSpace(c2);
                }
            }
        }
    }

    private final int _skipWSOrEnd() {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _eofAsNextChar();
            return -1;
        }
        char[] cArr = this._inputBuffer;
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        char c2 = cArr[i2];
        if (c2 > ' ') {
            if (c2 != '/' && c2 != '#') {
                return c2;
            }
            this._inputPtr = i2;
            return _skipWSOrEnd2();
        }
        if (c2 != ' ') {
            if (c2 == '\n') {
                this._currInputRow++;
                this._currInputRowStart = i3;
            } else if (c2 == '\r') {
                _skipCR();
            } else if (c2 != '\t' && !_isAllowedCtrlCharRS(c2)) {
                _throwInvalidSpace(c2);
            }
        }
        while (true) {
            int i4 = this._inputPtr;
            if (i4 >= this._inputEnd) {
                return _skipWSOrEnd2();
            }
            char[] cArr2 = this._inputBuffer;
            int i5 = i4 + 1;
            this._inputPtr = i5;
            char c3 = cArr2[i4];
            if (c3 > ' ') {
                if (c3 != '/' && c3 != '#') {
                    return c3;
                }
                this._inputPtr = i4;
                return _skipWSOrEnd2();
            }
            if (c3 != ' ') {
                if (c3 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i5;
                } else if (c3 == '\r') {
                    _skipCR();
                } else if (c3 != '\t' && !_isAllowedCtrlCharRS(c3)) {
                    _throwInvalidSpace(c3);
                }
            }
        }
    }

    private int _skipWSOrEnd2() {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _eofAsNextChar();
                return -1;
            }
            char[] cArr = this._inputBuffer;
            int i2 = this._inputPtr;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            char c2 = cArr[i2];
            if (c2 > ' ') {
                if (c2 == '/') {
                    _skipComment();
                } else {
                    if (c2 != '#') {
                        return c2;
                    }
                    if (!_skipYAMLComment()) {
                        return 35;
                    }
                }
            } else if (c2 != ' ') {
                if (c2 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                } else if (c2 == '\r') {
                    _skipCR();
                } else if (c2 != '\t') {
                    _throwInvalidSpace(c2);
                }
            }
        }
    }

    private boolean _skipYAMLComment() {
        if ((this._features & FEAT_MASK_ALLOW_YAML_COMMENTS) == 0) {
            return false;
        }
        _skipLine();
        return true;
    }

    private final void _updateLocation() {
        int i2 = this._inputPtr;
        this._tokenInputTotal = this._currInputProcessed + i2;
        this._tokenInputRow = this._currInputRow;
        this._tokenInputCol = i2 - this._currInputRowStart;
    }

    private final void _updateNameLocation() {
        int i2 = this._inputPtr;
        this._nameStartOffset = i2;
        this._nameStartRow = this._currInputRow;
        this._nameStartCol = i2 - this._currInputRowStart;
    }

    private char _verifyNLZ2() {
        char c2;
        if ((this._inputPtr >= this._inputEnd && !_loadMore()) || (c2 = this._inputBuffer[this._inputPtr]) < '0' || c2 > '9') {
            return '0';
        }
        if ((this._features & FEAT_MASK_LEADING_ZEROS) == 0) {
            reportInvalidNumber("Leading zeroes not allowed");
        }
        this._inputPtr++;
        if (c2 != '0') {
            return c2;
        }
        do {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return c2;
            }
            char[] cArr = this._inputBuffer;
            int i2 = this._inputPtr;
            c2 = cArr[i2];
            if (c2 < '0' || c2 > '9') {
                return '0';
            }
            this._inputPtr = i2 + 1;
        } while (c2 == '0');
        return c2;
    }

    private final char _verifyNoLeadingZeroes() {
        char c2;
        int i2 = this._inputPtr;
        if (i2 >= this._inputEnd || ((c2 = this._inputBuffer[i2]) >= '0' && c2 <= '9')) {
            return _verifyNLZ2();
        }
        return '0';
    }

    private final void _verifyRootSpace(int i2) {
        int i3 = this._inputPtr;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        if (i2 != 9) {
            if (i2 == 10) {
                this._currInputRow++;
                this._currInputRowStart = i4;
            } else if (i2 == 13) {
                this._inputPtr = i3;
            } else if (i2 != 32) {
                _reportMissingRootWS(i2);
            }
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    protected void _closeInput() throws IOException {
        if (this._reader != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this._reader.close();
            }
            this._reader = null;
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase
    protected JsonLocation _currentLocationMinusOne() {
        int i2 = this._inputPtr - 1;
        return new JsonLocation(_contentReference(), -1L, i2 + this._currInputProcessed, this._currInputRow, (i2 - this._currInputRowStart) + 1);
    }

    protected byte[] _decodeBase64(Base64Variant base64Variant) {
        ByteArrayBuilder byteArrayBuilder_getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            char[] cArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            char c2 = cArr[i2];
            if (c2 > ' ') {
                int iDecodeBase64Char = base64Variant.decodeBase64Char(c2);
                if (iDecodeBase64Char < 0) {
                    if (c2 == '\"') {
                        return byteArrayBuilder_getByteArrayBuilder.toByteArray();
                    }
                    iDecodeBase64Char = _decodeBase64Escape(base64Variant, c2, 0);
                    if (iDecodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr2 = this._inputBuffer;
                int i3 = this._inputPtr;
                this._inputPtr = i3 + 1;
                char c3 = cArr2[i3];
                int iDecodeBase64Char2 = base64Variant.decodeBase64Char(c3);
                if (iDecodeBase64Char2 < 0) {
                    iDecodeBase64Char2 = _decodeBase64Escape(base64Variant, c3, 1);
                }
                int i4 = iDecodeBase64Char << 6;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                int i5 = i4 | iDecodeBase64Char2;
                char[] cArr3 = this._inputBuffer;
                int i6 = this._inputPtr;
                this._inputPtr = i6 + 1;
                char c4 = cArr3[i6];
                int iDecodeBase64Char3 = base64Variant.decodeBase64Char(c4);
                if (iDecodeBase64Char3 < 0) {
                    if (iDecodeBase64Char3 != -2) {
                        if (c4 == '\"') {
                            byteArrayBuilder_getByteArrayBuilder.append(i5 >> 4);
                            if (base64Variant.requiresPaddingOnRead()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return byteArrayBuilder_getByteArrayBuilder.toByteArray();
                        }
                        iDecodeBase64Char3 = _decodeBase64Escape(base64Variant, c4, 2);
                    }
                    if (iDecodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        char[] cArr4 = this._inputBuffer;
                        int i7 = this._inputPtr;
                        this._inputPtr = i7 + 1;
                        char c5 = cArr4[i7];
                        if (!base64Variant.usesPaddingChar(c5) && _decodeBase64Escape(base64Variant, c5, 3) != -2) {
                            throw reportInvalidBase64Char(base64Variant, c5, 3, a.a(base64Variant));
                        }
                        byteArrayBuilder_getByteArrayBuilder.append(i5 >> 4);
                    }
                }
                int i8 = i5 << 6;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                int i9 = i8 | iDecodeBase64Char3;
                char[] cArr5 = this._inputBuffer;
                int i10 = this._inputPtr;
                this._inputPtr = i10 + 1;
                char c6 = cArr5[i10];
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(c6);
                if (iDecodeBase64Char4 < 0) {
                    if (iDecodeBase64Char4 != -2) {
                        if (c6 == '\"') {
                            byteArrayBuilder_getByteArrayBuilder.appendTwoBytes(i9 >> 2);
                            if (base64Variant.requiresPaddingOnRead()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return byteArrayBuilder_getByteArrayBuilder.toByteArray();
                        }
                        iDecodeBase64Char4 = _decodeBase64Escape(base64Variant, c6, 3);
                    }
                    if (iDecodeBase64Char4 == -2) {
                        byteArrayBuilder_getByteArrayBuilder.appendTwoBytes(i9 >> 2);
                    }
                }
                byteArrayBuilder_getByteArrayBuilder.appendThreeBytes((i9 << 6) | iDecodeBase64Char4);
            }
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    protected char _decodeEscaped() {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
        }
        char[] cArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        char c2 = cArr[i2];
        if (c2 == '\"' || c2 == '/' || c2 == '\\') {
            return c2;
        }
        if (c2 == 'b') {
            return '\b';
        }
        if (c2 == 'f') {
            return '\f';
        }
        if (c2 == 'n') {
            return '\n';
        }
        if (c2 == 'r') {
            return '\r';
        }
        if (c2 == 't') {
            return '\t';
        }
        if (c2 != 'u') {
            _handleUnrecognizedCharacterEscape(c2);
            return c2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 4; i4++) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
            }
            char[] cArr2 = this._inputBuffer;
            int i5 = this._inputPtr;
            this._inputPtr = i5 + 1;
            char c3 = cArr2[i5];
            int iCharToHex = CharTypes.charToHex(c3);
            if (iCharToHex < 0) {
                _reportUnexpectedChar(c3, "expected a hex-digit for character escape sequence");
            }
            i3 = (i3 << 4) | iCharToHex;
        }
        return (char) i3;
    }

    protected final void _finishString() {
        int i2 = this._inputPtr;
        int i3 = this._inputEnd;
        if (i2 < i3) {
            int[] iArr = INPUT_CODES_LATIN1;
            int length = iArr.length;
            while (true) {
                char[] cArr = this._inputBuffer;
                char c2 = cArr[i2];
                if (c2 >= length || iArr[c2] == 0) {
                    i2++;
                    if (i2 >= i3) {
                        break;
                    }
                } else if (c2 == '\"') {
                    TextBuffer textBuffer = this._textBuffer;
                    int i4 = this._inputPtr;
                    textBuffer.resetWithShared(cArr, i4, i2 - i4);
                    this._inputPtr = i2 + 1;
                    return;
                }
            }
        }
        TextBuffer textBuffer2 = this._textBuffer;
        char[] cArr2 = this._inputBuffer;
        int i5 = this._inputPtr;
        textBuffer2.resetWithCopy(cArr2, i5, i2 - i5);
        this._inputPtr = i2;
        _finishString2();
    }

    protected void _finishString2() {
        TextBuffer textBuffer = this._textBuffer;
        char[] currentSegment = textBuffer.getCurrentSegment();
        int currentSegmentSize = textBuffer.getCurrentSegmentSize();
        int[] iArr = INPUT_CODES_LATIN1;
        int length = iArr.length;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
            }
            char[] cArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            char c_decodeEscaped = cArr[i2];
            if (c_decodeEscaped < length && iArr[c_decodeEscaped] != 0) {
                if (c_decodeEscaped == '\"') {
                    this._textBuffer.setCurrentLength(currentSegmentSize);
                    return;
                } else if (c_decodeEscaped == '\\') {
                    c_decodeEscaped = _decodeEscaped();
                } else if (c_decodeEscaped < ' ') {
                    _throwUnquotedSpace(c_decodeEscaped, "string value");
                }
            }
            if (currentSegmentSize >= currentSegment.length) {
                currentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            currentSegment[currentSegmentSize] = c_decodeEscaped;
            currentSegmentSize++;
        }
    }

    protected final String _getText2(JsonToken jsonToken) {
        if (jsonToken == null) {
            return null;
        }
        int iId = jsonToken.id();
        return iId != 5 ? (iId == 6 || iId == 7 || iId == 8) ? this._textBuffer.contentsAsString() : jsonToken.asString() : this._parsingContext.getCurrentName();
    }

    protected JsonToken _handleApos() {
        TextBuffer textBuffer = this._textBuffer;
        char[] cArrEmptyAndGetCurrentSegment = textBuffer.emptyAndGetCurrentSegment();
        int currentSegmentSize = textBuffer.getCurrentSegmentSize();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
            }
            char[] cArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            char c_decodeEscaped = cArr[i2];
            if (c_decodeEscaped <= '\\') {
                if (c_decodeEscaped == '\\') {
                    c_decodeEscaped = _decodeEscaped();
                } else if (c_decodeEscaped <= '\'') {
                    if (c_decodeEscaped == '\'') {
                        this._textBuffer.setCurrentLength(currentSegmentSize);
                        return JsonToken.VALUE_STRING;
                    }
                    if (c_decodeEscaped < ' ') {
                        _throwUnquotedSpace(c_decodeEscaped, "string value");
                    }
                }
            }
            if (currentSegmentSize >= cArrEmptyAndGetCurrentSegment.length) {
                cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            cArrEmptyAndGetCurrentSegment[currentSegmentSize] = c_decodeEscaped;
            currentSegmentSize++;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r11v0 ??, r11v1 ??, r11v4 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    protected com.fasterxml.jackson.core.JsonToken _handleInvalidNumberStart(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r11v0 ??, r11v1 ??, r11v4 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r11v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    protected String _handleOddName(int i2) {
        if (i2 == 39) {
            if ((this._features & FEAT_MASK_ALLOW_SINGLE_QUOTES) != 0) {
                return _parseAposName();
            }
            i2 = 39;
        }
        if ((this._features & FEAT_MASK_ALLOW_UNQUOTED_NAMES) == 0) {
            _reportUnexpectedChar(i2, "was expecting double-quote to start field name");
        }
        int[] inputCodeLatin1JsNames = CharTypes.getInputCodeLatin1JsNames();
        int length = inputCodeLatin1JsNames.length;
        if (!(i2 < length ? inputCodeLatin1JsNames[i2] == 0 : Character.isJavaIdentifierPart((char) i2))) {
            _reportUnexpectedChar(i2, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int i3 = this._inputPtr;
        int i4 = this._hashSeed;
        int i5 = this._inputEnd;
        if (i3 < i5) {
            do {
                char[] cArr = this._inputBuffer;
                char c2 = cArr[i3];
                if (c2 < length) {
                    if (inputCodeLatin1JsNames[c2] != 0) {
                        int i6 = this._inputPtr - 1;
                        this._inputPtr = i3;
                        return this._symbols.findSymbol(cArr, i6, i3 - i6, i4);
                    }
                } else if (!Character.isJavaIdentifierPart(c2)) {
                    int i7 = this._inputPtr - 1;
                    this._inputPtr = i3;
                    return this._symbols.findSymbol(this._inputBuffer, i7, i3 - i7, i4);
                }
                i3++;
                i4 = (i4 * 33) + c2;
            } while (i3 < i5);
        }
        int i8 = this._inputPtr - 1;
        this._inputPtr = i3;
        return _handleOddName2(i8, i4, inputCodeLatin1JsNames);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.fasterxml.jackson.core.JsonToken _handleOddValue(int r4) {
        /*
            r3 = this;
            r0 = 39
            if (r4 == r0) goto L8e
            r0 = 73
            r1 = 1
            if (r4 == r0) goto L75
            r0 = 78
            if (r4 == r0) goto L5c
            r0 = 93
            if (r4 == r0) goto L3c
            r0 = 43
            if (r4 == r0) goto L1b
            r0 = 44
            if (r4 == r0) goto L44
            goto L9a
        L1b:
            int r4 = r3._inputPtr
            int r0 = r3._inputEnd
            if (r4 < r0) goto L2c
            boolean r4 = r3._loadMore()
            if (r4 != 0) goto L2c
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            r3._reportInvalidEOFInValue(r4)
        L2c:
            char[] r4 = r3._inputBuffer
            int r0 = r3._inputPtr
            int r2 = r0 + 1
            r3._inputPtr = r2
            char r4 = r4[r0]
            r0 = 0
            com.fasterxml.jackson.core.JsonToken r3 = r3._handleInvalidNumberStart(r4, r0, r1)
            return r3
        L3c:
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r3._parsingContext
            boolean r0 = r0.inArray()
            if (r0 == 0) goto L9a
        L44:
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r3._parsingContext
            boolean r0 = r0.inRoot()
            if (r0 != 0) goto L9a
            int r0 = r3._features
            int r1 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser.FEAT_MASK_ALLOW_MISSING
            r0 = r0 & r1
            if (r0 == 0) goto L9a
            int r4 = r3._inputPtr
            int r4 = r4 + (-1)
            r3._inputPtr = r4
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            return r3
        L5c:
            java.lang.String r0 = "NaN"
            r3._matchToken(r0, r1)
            int r1 = r3._features
            int r2 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser.FEAT_MASK_NON_NUM_NUMBERS
            r1 = r1 & r2
            if (r1 == 0) goto L6f
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            com.fasterxml.jackson.core.JsonToken r3 = r3.resetAsNaN(r0, r1)
            return r3
        L6f:
            java.lang.String r0 = "Non-standard token 'NaN': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow"
            r3._reportError(r0)
            goto L9a
        L75:
            java.lang.String r0 = "Infinity"
            r3._matchToken(r0, r1)
            int r1 = r3._features
            int r2 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser.FEAT_MASK_NON_NUM_NUMBERS
            r1 = r1 & r2
            if (r1 == 0) goto L88
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            com.fasterxml.jackson.core.JsonToken r3 = r3.resetAsNaN(r0, r1)
            return r3
        L88:
            java.lang.String r0 = "Non-standard token 'Infinity': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow"
            r3._reportError(r0)
            goto L9a
        L8e:
            int r0 = r3._features
            int r1 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser.FEAT_MASK_ALLOW_SINGLE_QUOTES
            r0 = r0 & r1
            if (r0 == 0) goto L9a
            com.fasterxml.jackson.core.JsonToken r3 = r3._handleApos()
            return r3
        L9a:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto Lb4
            char r0 = (char) r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = r3._validJsonTokenList()
            r3._reportInvalidToken(r0, r1)
        Lb4:
            java.lang.String r0 = r3._validJsonValueList()
            java.lang.String r1 = "expected a valid value "
            java.lang.String r0 = r1.concat(r0)
            r3._reportUnexpectedChar(r4, r0)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._handleOddValue(int):com.fasterxml.jackson.core.JsonToken");
    }

    protected boolean _isNextTokenNameMaybe(int i2, String str) throws JsonParseException {
        JsonToken jsonToken_parseSignedNumber;
        String str_parseName = i2 == 34 ? _parseName() : _handleOddName(i2);
        this._parsingContext.setCurrentName(str_parseName);
        _updateToken(JsonToken.FIELD_NAME);
        int i_skipColon = _skipColon();
        _updateLocation();
        if (i_skipColon == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return str.equals(str_parseName);
        }
        if (i_skipColon == 43) {
            jsonToken_parseSignedNumber = isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature()) ? _parseSignedNumber(false) : _handleOddValue(i_skipColon);
        } else if (i_skipColon == 91) {
            jsonToken_parseSignedNumber = JsonToken.START_ARRAY;
        } else if (i_skipColon == 102) {
            _matchFalse();
            jsonToken_parseSignedNumber = JsonToken.VALUE_FALSE;
        } else if (i_skipColon == 110) {
            _matchNull();
            jsonToken_parseSignedNumber = JsonToken.VALUE_NULL;
        } else if (i_skipColon == 116) {
            _matchTrue();
            jsonToken_parseSignedNumber = JsonToken.VALUE_TRUE;
        } else if (i_skipColon == 123) {
            jsonToken_parseSignedNumber = JsonToken.START_OBJECT;
        } else if (i_skipColon == 45) {
            jsonToken_parseSignedNumber = _parseSignedNumber(true);
        } else if (i_skipColon != 46) {
            switch (i_skipColon) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    jsonToken_parseSignedNumber = _parseUnsignedNumber(i_skipColon);
                    break;
                default:
                    jsonToken_parseSignedNumber = _handleOddValue(i_skipColon);
                    break;
            }
        } else {
            jsonToken_parseSignedNumber = _parseFloatThatStartsWithPeriod(false);
        }
        this._nextToken = jsonToken_parseSignedNumber;
        return str.equals(str_parseName);
    }

    protected boolean _loadMore() throws IOException {
        if (this._reader != null) {
            int i2 = this._inputEnd;
            long j2 = i2;
            long j3 = this._currInputProcessed + j2;
            this._currInputProcessed = j3;
            this._currInputRowStart -= i2;
            this._streamReadConstraints.validateDocumentLength(j3);
            Reader reader = this._reader;
            char[] cArr = this._inputBuffer;
            int i3 = reader.read(cArr, 0, cArr.length);
            if (i3 > 0) {
                this._nameStartOffset -= j2;
                this._inputPtr = 0;
                this._inputEnd = i3;
                return true;
            }
            this._inputEnd = 0;
            this._inputPtr = 0;
            _closeInput();
            if (i3 == 0) {
                throw new IOException("Reader returned 0 characters when trying to read " + this._inputEnd);
            }
        }
        return false;
    }

    protected void _loadMoreGuaranteed() {
        if (_loadMore()) {
            return;
        }
        _reportInvalidEOF();
    }

    protected final void _matchToken(String str, int i2) {
        int i3;
        int i4 = this._inputPtr;
        int length = str.length();
        if (i4 + length >= this._inputEnd) {
            _matchToken2(str, i2);
            return;
        }
        do {
            if (this._inputBuffer[this._inputPtr] != str.charAt(i2)) {
                _reportInvalidToken(str.substring(0, i2));
            }
            i3 = this._inputPtr + 1;
            this._inputPtr = i3;
            i2++;
        } while (i2 < length);
        char c2 = this._inputBuffer[i3];
        if (c2 < '0' || c2 == ']' || c2 == '}') {
            return;
        }
        _checkMatchEnd(str, i2, c2);
    }

    protected String _parseAposName() {
        int i2 = this._hashSeed;
        int i3 = this._inputPtr;
        int i4 = this._inputEnd;
        if (i3 < i4) {
            int[] iArr = INPUT_CODES_LATIN1;
            int length = iArr.length;
            do {
                char[] cArr = this._inputBuffer;
                char c2 = cArr[i3];
                if (c2 != '\'') {
                    if (c2 < length && iArr[c2] != 0) {
                        break;
                    }
                    i3++;
                    i2 = (i2 * 33) + c2;
                } else {
                    int i5 = this._inputPtr;
                    this._inputPtr = i3 + 1;
                    return this._symbols.findSymbol(cArr, i5, i3 - i5, i2);
                }
            } while (i3 < i4);
        }
        int i6 = this._inputPtr;
        this._inputPtr = i3;
        return _parseName2(i6, i2, 39);
    }

    protected final JsonToken _parseFloatThatStartsWithPeriod(boolean z) {
        if (!isEnabled(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
            return _handleOddValue(46);
        }
        int i2 = this._inputPtr;
        int i3 = i2 - 1;
        if (z) {
            i3 = i2 - 2;
        }
        return _parseFloat(46, i3, i2, z, 0);
    }

    protected final String _parseName() {
        int i2 = this._inputPtr;
        int[] iArr = INPUT_CODES_LATIN1;
        int i3 = this._hashSeed;
        while (true) {
            if (i2 >= this._inputEnd) {
                break;
            }
            char[] cArr = this._inputBuffer;
            char c2 = cArr[i2];
            if (c2 >= iArr.length || iArr[c2] == 0) {
                i2++;
                i3 = (i3 * 33) + c2;
            } else if (c2 == '\"') {
                int i4 = this._inputPtr;
                this._inputPtr = i2 + 1;
                return this._symbols.findSymbol(cArr, i4, i2 - i4, i3);
            }
        }
        int i5 = this._inputPtr;
        this._inputPtr = i2;
        return _parseName2(i5, i3, 34);
    }

    protected final JsonToken _parseUnsignedNumber(int i2) {
        int i3 = this._inputPtr;
        int i4 = i3 - 1;
        int i5 = this._inputEnd;
        char c2 = '0';
        if (i2 == 48) {
            return _parseNumber2(false, i4);
        }
        int i6 = 1;
        while (i3 < i5) {
            char c3 = c2;
            int i7 = i3 + 1;
            char c4 = this._inputBuffer[i3];
            if (c4 < c3 || c4 > '9') {
                if (c4 == '.' || (c4 | ' ') == 101) {
                    this._inputPtr = i7;
                    return _parseFloat(c4, i4, i7, false, i6);
                }
                this._inputPtr = i3;
                if (this._parsingContext.inRoot()) {
                    _verifyRootSpace(c4);
                }
                this._textBuffer.resetWithShared(this._inputBuffer, i4, i3 - i4);
                return resetInt(false, i6);
            }
            i6++;
            i3 = i7;
            c2 = c3;
        }
        this._inputPtr = i4;
        return _parseNumber2(false, i4);
    }

    protected int _readBinary(Base64Variant base64Variant, OutputStream outputStream, byte[] bArr) throws IOException {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            char[] cArr = this._inputBuffer;
            int i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            char c2 = cArr[i4];
            if (c2 > ' ') {
                int iDecodeBase64Char = base64Variant.decodeBase64Char(c2);
                if (iDecodeBase64Char < 0) {
                    if (c2 == '\"') {
                        break;
                    }
                    iDecodeBase64Char = _decodeBase64Escape(base64Variant, c2, 0);
                    if (iDecodeBase64Char < 0) {
                        continue;
                    }
                }
                if (i2 > bArr.length - 3) {
                    i3 += i2;
                    outputStream.write(bArr, 0, i2);
                    i2 = 0;
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr2 = this._inputBuffer;
                int i5 = this._inputPtr;
                this._inputPtr = i5 + 1;
                char c3 = cArr2[i5];
                int iDecodeBase64Char2 = base64Variant.decodeBase64Char(c3);
                if (iDecodeBase64Char2 < 0) {
                    iDecodeBase64Char2 = _decodeBase64Escape(base64Variant, c3, 1);
                }
                int i6 = iDecodeBase64Char << 6;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                int i7 = i6 | iDecodeBase64Char2;
                char[] cArr3 = this._inputBuffer;
                int i8 = this._inputPtr;
                this._inputPtr = i8 + 1;
                char c4 = cArr3[i8];
                int iDecodeBase64Char3 = base64Variant.decodeBase64Char(c4);
                if (iDecodeBase64Char3 < 0) {
                    if (iDecodeBase64Char3 != -2) {
                        if (c4 == '\"') {
                            int i9 = i2 + 1;
                            bArr[i2] = (byte) (i7 >> 4);
                            if (base64Variant.requiresPaddingOnRead()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            i2 = i9;
                        } else {
                            iDecodeBase64Char3 = _decodeBase64Escape(base64Variant, c4, 2);
                        }
                    }
                    if (iDecodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        char[] cArr4 = this._inputBuffer;
                        int i10 = this._inputPtr;
                        this._inputPtr = i10 + 1;
                        char c5 = cArr4[i10];
                        if (!base64Variant.usesPaddingChar(c5) && _decodeBase64Escape(base64Variant, c5, 3) != -2) {
                            throw reportInvalidBase64Char(base64Variant, c5, 3, a.a(base64Variant));
                        }
                        bArr[i2] = (byte) (i7 >> 4);
                        i2++;
                    }
                }
                int i11 = i2 + 1;
                int i12 = i2 + 2;
                int i13 = i7 << 6;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                int i14 = i13 | iDecodeBase64Char3;
                char[] cArr5 = this._inputBuffer;
                int i15 = this._inputPtr;
                this._inputPtr = i15 + 1;
                char c6 = cArr5[i15];
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(c6);
                if (iDecodeBase64Char4 < 0) {
                    if (iDecodeBase64Char4 != -2) {
                        if (c6 == '\"') {
                            bArr[i2] = (byte) (i14 >> 10);
                            bArr[i11] = (byte) (i14 >> 2);
                            if (base64Variant.requiresPaddingOnRead()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            i2 = i12;
                        } else {
                            iDecodeBase64Char4 = _decodeBase64Escape(base64Variant, c6, 3);
                        }
                    }
                    if (iDecodeBase64Char4 == -2) {
                        bArr[i2] = (byte) (i14 >> 10);
                        bArr[i11] = (byte) (i14 >> 2);
                        i2 = i12;
                    }
                }
                int i16 = (i14 << 6) | iDecodeBase64Char4;
                bArr[i2] = (byte) (i16 >> 16);
                bArr[i11] = (byte) (i16 >> 8);
                i2 += 3;
                bArr[i12] = (byte) i16;
            }
        }
        this._tokenIncomplete = false;
        if (i2 <= 0) {
            return i3;
        }
        int i17 = i3 + i2;
        outputStream.write(bArr, 0, i2);
        return i17;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    protected void _releaseBuffers() {
        char[] cArr;
        super._releaseBuffers();
        this._symbols.release();
        if (!this._bufferRecyclable || (cArr = this._inputBuffer) == null) {
            return;
        }
        this._inputBuffer = null;
        this._ioContext.releaseTokenBuffer(cArr);
    }

    protected void _reportInvalidToken(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            char c2 = this._inputBuffer[this._inputPtr];
            if (!Character.isJavaIdentifierPart(c2)) {
                break;
            }
            this._inputPtr++;
            sb.append(c2);
            if (sb.length() >= this._ioContext.errorReportConfiguration().getMaxErrorTokenLength()) {
                sb.append("...");
                break;
            }
        }
        _reportError("Unrecognized token '%s': was expecting %s", sb, str2);
    }

    protected final void _skipCR() {
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            char[] cArr = this._inputBuffer;
            int i2 = this._inputPtr;
            if (cArr[i2] == '\n') {
                this._inputPtr = i2 + 1;
            }
        }
        this._currInputRow++;
        this._currInputRowStart = this._inputPtr;
    }

    protected final void _skipString() {
        this._tokenIncomplete = false;
        int i2 = this._inputPtr;
        int i3 = this._inputEnd;
        char[] cArr = this._inputBuffer;
        while (true) {
            if (i2 >= i3) {
                this._inputPtr = i2;
                if (!_loadMore()) {
                    _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
                }
                i2 = this._inputPtr;
                i3 = this._inputEnd;
            }
            char c2 = cArr[i2];
            i2++;
            if (c2 <= '\\') {
                if (c2 == '\\') {
                    this._inputPtr = i2;
                    _decodeEscaped();
                    i2 = this._inputPtr;
                    i3 = this._inputEnd;
                } else if (c2 > '\"') {
                    continue;
                } else if (c2 == '\"') {
                    this._inputPtr = i2;
                    return;
                } else if (c2 < ' ') {
                    this._inputPtr = i2;
                    _throwUnquotedSpace(c2, "string value");
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation currentLocation() {
        return new JsonLocation(_contentReference(), -1L, this._inputPtr + this._currInputProcessed, this._currInputRow, (this._inputPtr - this._currInputRowStart) + 1);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation currentTokenLocation() {
        if (this._currToken != JsonToken.FIELD_NAME) {
            return new JsonLocation(_contentReference(), -1L, this._tokenInputTotal - 1, this._tokenInputRow, this._tokenInputCol);
        }
        return new JsonLocation(_contentReference(), -1L, this._currInputProcessed + (this._nameStartOffset - 1), this._nameStartRow, this._nameStartCol);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void finishToken() {
        if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public byte[] getBinaryValue(Base64Variant base64Variant) throws JsonParseException {
        byte[] bArr;
        if (this._currToken == JsonToken.VALUE_EMBEDDED_OBJECT && (bArr = this._binaryValue) != null) {
            return bArr;
        }
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING) {
            _reportError("Current token (" + String.valueOf(jsonToken) + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this._tokenIncomplete) {
            try {
                this._binaryValue = _decodeBase64(base64Variant);
                this._tokenIncomplete = false;
            } catch (IllegalArgumentException e2) {
                throw _constructError("Failed to decode VALUE_STRING as base64 (" + String.valueOf(base64Variant) + "): " + e2.getMessage());
            }
        } else if (this._binaryValue == null) {
            ByteArrayBuilder byteArrayBuilder_getByteArrayBuilder = _getByteArrayBuilder();
            _decodeBase64(getText(), byteArrayBuilder_getByteArrayBuilder, base64Variant);
            this._binaryValue = byteArrayBuilder_getByteArrayBuilder.toByteArray();
        }
        return this._binaryValue;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object getInputSource() {
        return this._reader;
    }

    protected char getNextChar(String str, JsonToken jsonToken) {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(str, jsonToken);
        }
        char[] cArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        return cArr[i2];
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getText(Writer writer) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.contentsToWriter(writer);
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            String currentName = this._parsingContext.getCurrentName();
            writer.write(currentName);
            return currentName.length();
        }
        if (jsonToken == null) {
            return 0;
        }
        if (jsonToken.isNumeric()) {
            return this._textBuffer.contentsToWriter(writer);
        }
        char[] cArrAsCharArray = jsonToken.asCharArray();
        writer.write(cArrAsCharArray);
        return cArrAsCharArray.length;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final char[] getTextCharacters() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return null;
        }
        int iId = jsonToken.id();
        if (iId != 5) {
            if (iId != 6) {
                if (iId != 7 && iId != 8) {
                    return jsonToken.asCharArray();
                }
            } else if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.getTextBuffer();
        }
        if (!this._nameCopied) {
            String currentName = this._parsingContext.getCurrentName();
            int length = currentName.length();
            char[] cArr = this._nameCopyBuffer;
            if (cArr == null) {
                this._nameCopyBuffer = this._ioContext.allocNameCopyBuffer(length);
            } else if (cArr.length < length) {
                this._nameCopyBuffer = new char[length];
            }
            currentName.getChars(0, length, this._nameCopyBuffer, 0);
            this._nameCopied = true;
        }
        return this._nameCopyBuffer;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final int getTextLength() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        int iId = jsonToken.id();
        if (iId == 5) {
            return this._parsingContext.getCurrentName().length();
        }
        if (iId != 6) {
            if (iId != 7 && iId != 8) {
                return jsonToken.asCharArray().length;
            }
        } else if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
        return this._textBuffer.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0011, code lost:
    
        if (r0 != 8) goto L16;
     */
    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getTextOffset() {
        /*
            r3 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r3._currToken
            r1 = 0
            if (r0 == 0) goto L24
            int r0 = r0.id()
            r2 = 6
            if (r0 == r2) goto L14
            r2 = 7
            if (r0 == r2) goto L1d
            r2 = 8
            if (r0 == r2) goto L1d
            goto L24
        L14:
            boolean r0 = r3._tokenIncomplete
            if (r0 == 0) goto L1d
            r3._tokenIncomplete = r1
            r3._finishString()
        L1d:
            com.fasterxml.jackson.core.util.TextBuffer r3 = r3._textBuffer
            int r3 = r3.getTextOffset()
            return r3
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getTextOffset():int");
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final String getValueAsString() {
        if (this._currToken != JsonToken.VALUE_STRING) {
            return this._currToken == JsonToken.FIELD_NAME ? currentName() : super.getValueAsString(null);
        }
        if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
        return this._textBuffer.contentsAsString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r3 == 10) goto L22;
     */
    @Override // com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean nextBooleanValue() throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r3 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r3._currToken
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME
            r2 = 0
            if (r0 != r1) goto L33
            r0 = 0
            r3._nameCopied = r0
            com.fasterxml.jackson.core.JsonToken r0 = r3._nextToken
            r3._nextToken = r2
            r3._updateToken(r0)
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE
            if (r0 != r1) goto L16
            goto L48
        L16:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE
            if (r0 != r1) goto L1b
            goto L45
        L1b:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.START_ARRAY
            if (r0 != r1) goto L27
            int r0 = r3._tokenInputRow
            int r1 = r3._tokenInputCol
            r3.createChildArrayContext(r0, r1)
            goto L4b
        L27:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.START_OBJECT
            if (r0 != r1) goto L4b
            int r0 = r3._tokenInputRow
            int r1 = r3._tokenInputCol
            r3.createChildObjectContext(r0, r1)
            goto L4b
        L33:
            com.fasterxml.jackson.core.JsonToken r3 = r3.nextToken()
            if (r3 == 0) goto L4b
            int r3 = r3.id()
            r0 = 9
            if (r3 == r0) goto L48
            r0 = 10
            if (r3 != r0) goto L4b
        L45:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            return r3
        L48:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            return r3
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextBooleanValue():java.lang.Boolean");
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String nextFieldName() throws JsonParseException {
        JsonToken jsonToken_parseSignedNumber;
        this._numTypesValid = 0;
        if (this._currToken == JsonToken.FIELD_NAME) {
            _nextAfterName();
            return null;
        }
        if (this._tokenIncomplete) {
            _skipString();
        }
        int i_skipWSOrEnd = _skipWSOrEnd();
        if (i_skipWSOrEnd < 0) {
            close();
            _updateTokenToNull();
            return null;
        }
        this._binaryValue = null;
        if ((i_skipWSOrEnd | 32) == 125) {
            _closeScope(i_skipWSOrEnd);
            return null;
        }
        if (this._parsingContext.expectComma()) {
            i_skipWSOrEnd = _skipComma(i_skipWSOrEnd);
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (i_skipWSOrEnd | 32) == 125) {
                _closeScope(i_skipWSOrEnd);
                return null;
            }
        }
        if (!this._parsingContext.inObject()) {
            _updateLocation();
            _nextTokenNotInObject(i_skipWSOrEnd);
            return null;
        }
        _updateNameLocation();
        String str_parseName = i_skipWSOrEnd == 34 ? _parseName() : _handleOddName(i_skipWSOrEnd);
        this._parsingContext.setCurrentName(str_parseName);
        _updateToken(JsonToken.FIELD_NAME);
        int i_skipColon = _skipColon();
        _updateLocation();
        if (i_skipColon == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return str_parseName;
        }
        if (i_skipColon == 43) {
            jsonToken_parseSignedNumber = isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature()) ? _parseSignedNumber(false) : _handleOddValue(i_skipColon);
        } else if (i_skipColon == 91) {
            jsonToken_parseSignedNumber = JsonToken.START_ARRAY;
        } else if (i_skipColon == 102) {
            _matchFalse();
            jsonToken_parseSignedNumber = JsonToken.VALUE_FALSE;
        } else if (i_skipColon == 110) {
            _matchNull();
            jsonToken_parseSignedNumber = JsonToken.VALUE_NULL;
        } else if (i_skipColon == 116) {
            _matchTrue();
            jsonToken_parseSignedNumber = JsonToken.VALUE_TRUE;
        } else if (i_skipColon == 123) {
            jsonToken_parseSignedNumber = JsonToken.START_OBJECT;
        } else if (i_skipColon == 45) {
            jsonToken_parseSignedNumber = _parseSignedNumber(true);
        } else if (i_skipColon != 46) {
            switch (i_skipColon) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    jsonToken_parseSignedNumber = _parseUnsignedNumber(i_skipColon);
                    break;
                default:
                    jsonToken_parseSignedNumber = _handleOddValue(i_skipColon);
                    break;
            }
        } else {
            jsonToken_parseSignedNumber = _parseFloatThatStartsWithPeriod(false);
        }
        this._nextToken = jsonToken_parseSignedNumber;
        return str_parseName;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int nextIntValue(int i2) {
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            _updateToken(jsonToken);
            if (jsonToken == JsonToken.VALUE_NUMBER_INT) {
                return getIntValue();
            }
            if (jsonToken == JsonToken.START_ARRAY) {
                createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
                return i2;
            }
            if (jsonToken == JsonToken.START_OBJECT) {
                createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
                return i2;
            }
        } else if (nextToken() == JsonToken.VALUE_NUMBER_INT) {
            return getIntValue();
        }
        return i2;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final long nextLongValue(long j2) {
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            _updateToken(jsonToken);
            if (jsonToken == JsonToken.VALUE_NUMBER_INT) {
                return getLongValue();
            }
            if (jsonToken == JsonToken.START_ARRAY) {
                createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
                return j2;
            }
            if (jsonToken == JsonToken.START_OBJECT) {
                createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
                return j2;
            }
        } else if (nextToken() == JsonToken.VALUE_NUMBER_INT) {
            return getLongValue();
        }
        return j2;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String nextTextValue() {
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            _updateToken(jsonToken);
            if (jsonToken == JsonToken.VALUE_STRING) {
                if (this._tokenIncomplete) {
                    this._tokenIncomplete = false;
                    _finishString();
                }
                return this._textBuffer.contentsAsString();
            }
            if (jsonToken == JsonToken.START_ARRAY) {
                createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            } else if (jsonToken == JsonToken.START_OBJECT) {
                createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            }
        } else if (nextToken() == JsonToken.VALUE_STRING) {
            return getText();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final JsonToken nextToken() throws JsonParseException {
        JsonToken jsonToken_parseSignedNumber;
        if (this._currToken == JsonToken.FIELD_NAME) {
            return _nextAfterName();
        }
        this._numTypesValid = 0;
        if (this._tokenIncomplete) {
            _skipString();
        }
        int i_skipWSOrEnd = _skipWSOrEnd();
        if (i_skipWSOrEnd < 0) {
            close();
            _updateTokenToNull();
            return null;
        }
        this._binaryValue = null;
        if ((i_skipWSOrEnd | 32) == 125) {
            _closeScope(i_skipWSOrEnd);
            return this._currToken;
        }
        if (this._parsingContext.expectComma()) {
            i_skipWSOrEnd = _skipComma(i_skipWSOrEnd);
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (i_skipWSOrEnd | 32) == 125) {
                _closeScope(i_skipWSOrEnd);
                return this._currToken;
            }
        }
        boolean zInObject = this._parsingContext.inObject();
        if (zInObject) {
            _updateNameLocation();
            this._parsingContext.setCurrentName(i_skipWSOrEnd == 34 ? _parseName() : _handleOddName(i_skipWSOrEnd));
            _updateToken(JsonToken.FIELD_NAME);
            i_skipWSOrEnd = _skipColon();
        }
        _updateLocation();
        if (i_skipWSOrEnd == 34) {
            this._tokenIncomplete = true;
            jsonToken_parseSignedNumber = JsonToken.VALUE_STRING;
        } else if (i_skipWSOrEnd == 43) {
            jsonToken_parseSignedNumber = isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature()) ? _parseSignedNumber(false) : _handleOddValue(i_skipWSOrEnd);
        } else if (i_skipWSOrEnd == 91) {
            if (!zInObject) {
                createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            }
            jsonToken_parseSignedNumber = JsonToken.START_ARRAY;
        } else if (i_skipWSOrEnd == 102) {
            _matchFalse();
            jsonToken_parseSignedNumber = JsonToken.VALUE_FALSE;
        } else if (i_skipWSOrEnd == 110) {
            _matchNull();
            jsonToken_parseSignedNumber = JsonToken.VALUE_NULL;
        } else if (i_skipWSOrEnd == 116) {
            _matchTrue();
            jsonToken_parseSignedNumber = JsonToken.VALUE_TRUE;
        } else if (i_skipWSOrEnd == 123) {
            if (!zInObject) {
                createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            }
            jsonToken_parseSignedNumber = JsonToken.START_OBJECT;
        } else if (i_skipWSOrEnd == 125) {
            _reportUnexpectedChar(i_skipWSOrEnd, "expected a value");
            _matchTrue();
            jsonToken_parseSignedNumber = JsonToken.VALUE_TRUE;
        } else if (i_skipWSOrEnd == 45) {
            jsonToken_parseSignedNumber = _parseSignedNumber(true);
        } else if (i_skipWSOrEnd != 46) {
            switch (i_skipWSOrEnd) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    jsonToken_parseSignedNumber = _parseUnsignedNumber(i_skipWSOrEnd);
                    break;
                default:
                    jsonToken_parseSignedNumber = _handleOddValue(i_skipWSOrEnd);
                    break;
            }
        } else {
            jsonToken_parseSignedNumber = _parseFloatThatStartsWithPeriod(false);
        }
        if (zInObject) {
            this._nextToken = jsonToken_parseSignedNumber;
            return this._currToken;
        }
        _updateToken(jsonToken_parseSignedNumber);
        return jsonToken_parseSignedNumber;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        if (!this._tokenIncomplete || this._currToken != JsonToken.VALUE_STRING) {
            byte[] binaryValue = getBinaryValue(base64Variant);
            outputStream.write(binaryValue);
            return binaryValue.length;
        }
        byte[] bArrAllocBase64Buffer = this._ioContext.allocBase64Buffer();
        try {
            return _readBinary(base64Variant, outputStream, bArrAllocBase64Buffer);
        } finally {
            this._ioContext.releaseBase64Buffer(bArrAllocBase64Buffer);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int releaseBuffered(Writer writer) throws IOException {
        int i2 = this._inputEnd;
        int i3 = this._inputPtr;
        int i4 = i2 - i3;
        if (i4 <= 0) {
            return 0;
        }
        this._inputPtr = i3 + i4;
        writer.write(this._inputBuffer, i3, i4);
        return i4;
    }

    public ReaderBasedJsonParser(IOContext iOContext, int i2, Reader reader, ObjectCodec objectCodec, CharsToNameCanonicalizer charsToNameCanonicalizer) {
        super(iOContext, i2, objectCodec);
        this._reader = reader;
        this._inputBuffer = iOContext.allocTokenBuffer();
        this._inputPtr = 0;
        this._inputEnd = 0;
        this._symbols = charsToNameCanonicalizer;
        this._hashSeed = charsToNameCanonicalizer.hashSeed();
        this._bufferRecyclable = true;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final String getValueAsString(String str) {
        if (this._currToken != JsonToken.VALUE_STRING) {
            if (this._currToken == JsonToken.FIELD_NAME) {
                return currentName();
            }
            return super.getValueAsString(str);
        }
        if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
        return this._textBuffer.contentsAsString();
    }

    protected void _reportInvalidToken(String str) {
        _reportInvalidToken(str, _validJsonTokenList());
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final String getText() {
        if (this._currToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.contentsAsString();
        }
        return _getText2(this._currToken);
    }

    protected JsonToken _handleInvalidNumberStart(int i2, boolean z) {
        return _handleInvalidNumberStart(i2, z, false);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean nextFieldName(SerializableString serializableString) throws JsonParseException {
        int i2 = 0;
        this._numTypesValid = 0;
        if (this._currToken == JsonToken.FIELD_NAME) {
            _nextAfterName();
            return false;
        }
        if (this._tokenIncomplete) {
            _skipString();
        }
        int i_skipWSOrEnd = _skipWSOrEnd();
        if (i_skipWSOrEnd < 0) {
            close();
            _updateTokenToNull();
            return false;
        }
        this._binaryValue = null;
        if ((i_skipWSOrEnd | 32) == 125) {
            _closeScope(i_skipWSOrEnd);
            return false;
        }
        if (this._parsingContext.expectComma()) {
            i_skipWSOrEnd = _skipComma(i_skipWSOrEnd);
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (i_skipWSOrEnd | 32) == 125) {
                _closeScope(i_skipWSOrEnd);
                return false;
            }
        }
        if (!this._parsingContext.inObject()) {
            _updateLocation();
            _nextTokenNotInObject(i_skipWSOrEnd);
            return false;
        }
        _updateNameLocation();
        if (i_skipWSOrEnd == 34) {
            char[] cArrAsQuotedChars = serializableString.asQuotedChars();
            int length = cArrAsQuotedChars.length;
            int i3 = this._inputPtr;
            int i4 = length + i3;
            if (i4 + 4 < this._inputEnd && this._inputBuffer[i4] == '\"') {
                while (i3 != i4) {
                    if (cArrAsQuotedChars[i2] == this._inputBuffer[i3]) {
                        i2++;
                        i3++;
                    }
                }
                this._parsingContext.setCurrentName(serializableString.getValue());
                _isNextTokenNameYes(_skipColonFast(i3 + 1));
                return true;
            }
            i_skipWSOrEnd = 34;
        }
        return _isNextTokenNameMaybe(i_skipWSOrEnd, serializableString.getValue());
    }
}
