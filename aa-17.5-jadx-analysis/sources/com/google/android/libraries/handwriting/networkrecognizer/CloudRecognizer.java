package com.google.android.libraries.handwriting.networkrecognizer;

import android.util.Log;
import com.google.android.libraries.handwriting.base.HandwritingRecognizer;
import com.google.android.libraries.handwriting.base.RecognitionResult;
import com.google.android.libraries.handwriting.base.StrokeList;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.a;
import defpackage.ahgm;
import defpackage.ahku;
import defpackage.ajpb;
import defpackage.ajpj;
import defpackage.ajpr;
import defpackage.ajqu;
import defpackage.ajqy;
import defpackage.ajra;
import defpackage.ajrp;
import defpackage.ajrs;
import defpackage.ajuy;
import defpackage.ajuz;
import defpackage.ajvb;
import defpackage.akaz;
import defpackage.akbh;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class CloudRecognizer extends HandwritingRecognizer {
    private static final String TAG = "HWRCloudReco";
    protected final List<Feedback> feedbacks;
    protected final ajqy httpClient;
    protected final CloudRecognizerSettings settings;

    public static class CloudRecognizerSettings extends HandwritingRecognizer.HandwritingRecognizerSettings {
        public String encodedPrivacyContextHeader;
        public String server = "https://inputtools.google.com";
        public String recoPath = "/request";
        public boolean compressRequests = true;
        public boolean sendFeedbackImmediately = true;
        public int feedbackBatchSize = 5;
        public boolean returnSegmentation = false;
    }

    public class InvalidResponseFromServerException extends Exception {
        final String errorMessage;

        public InvalidResponseFromServerException(CloudRecognizer cloudRecognizer, String str) {
            cloudRecognizer.getClass();
            this.errorMessage = str;
        }
    }

    public CloudRecognizer() {
        this.feedbacks = new ArrayList();
        this.httpClient = HandwritingHttpClient.getNewHttpClient();
        this.settings = new CloudRecognizerSettings();
    }

    private static void addContext(JSONObject jSONObject, String str) throws JSONException {
        if (str == null || str.length() <= 0) {
            return;
        }
        jSONObject.put("pre_context", str);
    }

    private static void addInputType(JSONObject jSONObject, String str) throws JSONException {
        jSONObject.put(CloudRecognizerProtocolStrings.INPUT_TYPE, str);
    }

    private ArrayList<RecognitionResult.SegmentationInfo> getSegmentationInfos(JSONArray jSONArray) throws JSONException {
        JSONArray jSONArray2 = jSONArray.getJSONObject(3).getJSONArray("segmentation");
        int length = jSONArray2.length();
        ArrayList<RecognitionResult.SegmentationInfo> arrayList = new ArrayList<>(length);
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            JSONArray jSONArray3 = jSONArray2.getJSONArray(i2);
            int length2 = jSONArray3.length();
            String[] strArr = new String[length2];
            int[][][] iArr = new int[length2][][];
            int i3 = i;
            while (i3 < length2) {
                strArr[i3] = jSONArray3.getJSONArray(i3).getString(i);
                JSONArray jSONArray4 = jSONArray3.getJSONArray(i3).getJSONArray(1);
                int length3 = jSONArray4.length();
                int[] iArr2 = new int[2];
                iArr2[1] = 4;
                iArr2[i] = length3;
                iArr[i3] = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iArr2);
                int i4 = i;
                while (i4 < length3) {
                    for (int i5 = i; i5 < 4; i5++) {
                        iArr[i3][i4][i5] = jSONArray4.getJSONArray(i4).getInt(i5);
                    }
                    i4++;
                    i = 0;
                }
                i3++;
                i = 0;
            }
            arrayList.add(new RecognitionResult.SegmentationInfo(strArr, iArr));
            i2++;
            i = 0;
        }
        return arrayList;
    }

    private static byte[] gzipString(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new GZIPOutputStream(byteArrayOutputStream), StandardCharsets.UTF_8);
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (IOException e) {
            Log.e(TAG, "gzipString", e);
        }
        return byteArrayOutputStream.toByteArray();
    }

    private void logVi(int i, String str, String str2) {
        CloudRecognizerSettings cloudRecognizerSettings = this.settings;
        if (cloudRecognizerSettings != null && cloudRecognizerSettings.verbosity >= i) {
            Log.i(str, str2);
        }
    }

    private void maybeAddOptions(JSONObject jSONObject, boolean z) throws JSONException {
        StringBuilder sb = new StringBuilder();
        if (z) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(CloudRecognizerProtocolStrings.OPTION_RETURN_SEGMENTATION);
        }
        if (sb.length() > 0) {
            jSONObject.put(CloudRecognizerProtocolStrings.OPTIONS, sb);
        }
    }

    private JSONObject prepareJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(CloudRecognizerProtocolStrings.APP_VERSION, this.settings.clientVersion);
        jSONObject.put(CloudRecognizerProtocolStrings.API_LEVEL, this.settings.deviceVersion);
        jSONObject.put(CloudRecognizerProtocolStrings.DEVICE, this.settings.deviceName);
        return jSONObject;
    }

    private void timing(long j, int i, String str) {
        logVi(3, TAG, "Timing(" + i + ") " + str + ": " + (System.currentTimeMillis() - j));
    }

    public String buildFeedbackRequest(Feedback feedback) throws JSONException {
        JSONObject jSONObjectPrepareJSONObject = prepareJSONObject();
        StrokeList strokeList = feedback.strokes;
        if (strokeList != null) {
            addInputType(jSONObjectPrepareJSONObject, strokeList.getInputType());
            maybeAddOptions(jSONObjectPrepareJSONObject, false);
            if (feedback.strokes.getUserId().length() > 0) {
                jSONObjectPrepareJSONObject.put(CloudRecognizerProtocolStrings.USER_ID, feedback.strokes.getUserId());
            }
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(feedback.asJsonObject(this.settings.language));
        jSONObjectPrepareJSONObject.put(CloudRecognizerProtocolStrings.REQUESTS, jSONArray);
        return jSONObjectPrepareJSONObject.toString();
    }

    public String buildFeedbacksRequest(List<Feedback> list) throws JSONException {
        StrokeList strokeList;
        JSONObject jSONObjectPrepareJSONObject = prepareJSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONObjectPrepareJSONObject.put(CloudRecognizerProtocolStrings.REQUESTS, jSONArray);
        for (Feedback feedback : list) {
            if (list.size() == 1 && (strokeList = feedback.strokes) != null) {
                addInputType(jSONObjectPrepareJSONObject, strokeList.getInputType());
            }
            jSONArray.put(feedback.asJsonObject(this.settings.language));
            StrokeList strokeList2 = feedback.strokes;
            if (strokeList2 != null && strokeList2.getUserId() != null && feedback.strokes.getUserId().length() > 0) {
                jSONObjectPrepareJSONObject.put(CloudRecognizerProtocolStrings.USER_ID, feedback.strokes.getUserId());
            }
        }
        maybeAddOptions(jSONObjectPrepareJSONObject, false);
        this.feedbacks.clear();
        return jSONObjectPrepareJSONObject.toString();
    }

    public String buildRecognitionRequestString(StrokeList strokeList) throws JSONException {
        JSONObject jSONObjectPrepareJSONObject = prepareJSONObject();
        addInputType(jSONObjectPrepareJSONObject, strokeList.getInputType());
        maybeAddOptions(jSONObjectPrepareJSONObject, this.settings.returnSegmentation);
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObjectAsJsonObject = strokeList.asJsonObject();
        jSONObjectAsJsonObject.put("language", this.settings.language);
        jSONArray.put(jSONObjectAsJsonObject);
        jSONObjectPrepareJSONObject.put(CloudRecognizerProtocolStrings.REQUESTS, jSONArray);
        Iterator<Feedback> it = this.feedbacks.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().asJsonObject(this.settings.language));
        }
        this.feedbacks.clear();
        return jSONObjectPrepareJSONObject.toString();
    }

    public String executeHttpRequest(String str, long j, int i) throws UnsupportedOperationException, ajpr, IOException, UnsupportedCharsetException {
        timing(j, i, "before creating request");
        CloudRecognizerSettings cloudRecognizerSettings = this.settings;
        String strRecognitionUrl = CloudRecognizerProtocolStrings.recognitionUrl(cloudRecognizerSettings.server, cloudRecognizerSettings.recoPath, cloudRecognizerSettings.clientName);
        logVi(3, TAG, "URL = ".concat(String.valueOf(strRecognitionUrl)));
        ajrs ajrsVar = new ajrs(strRecognitionUrl);
        String string = null;
        charset = null;
        Charset charset = null;
        if (this.settings.compressRequests) {
            byte[] bArrGzipString = gzipString(str);
            timing(j, i, "passed after building request string");
            ajuy ajuyVar = new ajuy(bArrGzipString);
            ajuyVar.j("application/octet-stream");
            ((ajrp) ajrsVar).c = ajuyVar;
        } else {
            String strName = StandardCharsets.UTF_8.name();
            ajvb ajvbVar = new ajvb(str, ajuz.a(ajuz.p.s, !ahku.a(strName) ? Charset.forName(strName) : null));
            ajvbVar.j("application/json");
            ((ajrp) ajrsVar).c = ajvbVar;
        }
        String str2 = this.settings.encodedPrivacyContextHeader;
        if (str2 != null) {
            ajrsVar.h("X-Client-Pctx", str2);
        }
        timing(j, i, "before sending request to server");
        ajpj ajpjVarExecute = this.httpClient.execute(ajrsVar);
        timing(j, i, "got response from server");
        int i2 = ajpjVarExecute.p().b;
        if (i2 != 200) {
            throw new ajra(i2, ajpjVarExecute.p().toString());
        }
        ajpb ajpbVarA = ajpjVarExecute.a();
        ahgm.e(ajpbVarA, "Entity");
        ajuz ajuzVarB = ajuz.b(ajpbVarA);
        InputStream inputStreamB = ajpbVarA.b();
        if (inputStreamB != null) {
            try {
                ahgm.a(ajpbVarA.a() <= 2147483647L, "HTTP entity too large to be buffered in memory");
                int iA = (int) ajpbVarA.a();
                if (iA < 0) {
                    iA = 4096;
                }
                if (ajuzVarB != null) {
                    Charset charset2 = ajuzVarB.t;
                    if (charset2 == null) {
                        String str3 = ajuzVarB.s;
                        ajuz ajuzVar = str3 == null ? null : (ajuz) ajuz.r.get(str3);
                        if (ajuzVar != null) {
                            charset = ajuzVar.t;
                        }
                    } else {
                        charset = charset2;
                    }
                }
                if (charset == null) {
                    charset = akaz.a;
                }
                InputStreamReader inputStreamReader = new InputStreamReader(inputStreamB, charset);
                akbh akbhVar = new akbh(iA);
                char[] cArr = new char[1024];
                while (true) {
                    int i3 = inputStreamReader.read(cArr);
                    if (i3 == -1) {
                        break;
                    }
                    akbhVar.h(cArr, 0, i3);
                }
                string = akbhVar.toString();
            } finally {
                inputStreamB.close();
            }
        }
        ajpjVarExecute.a().e();
        timing(j, i, "network handling done entirely");
        return string;
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public String feedback(String str, StrokeList strokeList, String str2, String str3) throws HandwritingRecognizer.SendingFeedbackFailedException {
        return recordOrSendFeedback(new Feedback(str, strokeList, str2, str3));
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public HandwritingRecognizer getSecondaryRecognizer() {
        return null;
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public HandwritingRecognizer.HandwritingRecognizerSettings getSettings() {
        return this.settings;
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public boolean hasSecondaryRecognizer() {
        return false;
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public boolean isCloudRecognizer() {
        return true;
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public boolean isSendingFeedback() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.libraries.handwriting.base.RecognitionResult parseServerResponse(java.lang.String r14) throws org.json.JSONException, com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizer.InvalidResponseFromServerException {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizer.parseServerResponse(java.lang.String):com.google.android.libraries.handwriting.base.RecognitionResult");
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public RecognitionResult recognize(StrokeList strokeList, HandwritingRecognizer.CancelStruct cancelStruct) throws UnsupportedOperationException, ajpr, HandwritingRecognizer.RecognitionFailedException, UnsupportedCharsetException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            timing(jCurrentTimeMillis, 0, "before creating JSON");
            String strBuildRecognitionRequestString = buildRecognitionRequestString(strokeList);
            timing(jCurrentTimeMillis, 0, "JSON created");
            String strExecuteHttpRequest = executeHttpRequest(strBuildRecognitionRequestString, jCurrentTimeMillis, 0);
            logVi(3, TAG, a.bz(strExecuteHttpRequest, "response = "));
            return parseServerResponse(strExecuteHttpRequest);
        } catch (ajra e) {
            throw new HandwritingRecognizer.RecognitionFailedException("network problems", e);
        } catch (ajqu e2) {
            throw new HandwritingRecognizer.RecognitionFailedException("protocol problem", e2);
        } catch (InvalidResponseFromServerException e3) {
            throw new HandwritingRecognizer.RecognitionFailedException("invalid response: ".concat(String.valueOf(e3.errorMessage)), e3);
        } catch (UnsupportedEncodingException e4) {
            throw new HandwritingRecognizer.RecognitionFailedException("encoding problem", e4);
        } catch (IOException e5) {
            throw new HandwritingRecognizer.RecognitionFailedException("network io problem", e5);
        } catch (JSONException e6) {
            throw new HandwritingRecognizer.RecognitionFailedException("json problem", e6);
        }
    }

    public String recordOrSendFeedback(Feedback feedback) throws HandwritingRecognizer.SendingFeedbackFailedException {
        this.feedbacks.add(feedback);
        CloudRecognizerSettings cloudRecognizerSettings = this.settings;
        if (!cloudRecognizerSettings.sendFeedbackImmediately && this.feedbacks.size() < cloudRecognizerSettings.feedbackBatchSize) {
            return "";
        }
        try {
            String strExecuteHttpRequest = executeHttpRequest(buildFeedbacksRequest(this.feedbacks), System.currentTimeMillis(), 0);
            parseServerResponse(strExecuteHttpRequest);
            return strExecuteHttpRequest;
        } catch (Exception e) {
            Log.e(TAG, "Feedback failed: ", e);
            throw new HandwritingRecognizer.SendingFeedbackFailedException("Sending feedback failed", e);
        }
    }

    public void setLanguage(String str) {
        this.settings.language = str;
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    @ResultIgnorabilityUnspecified
    public String feedback(String str, String str2, String str3, String str4) throws HandwritingRecognizer.SendingFeedbackFailedException {
        return recordOrSendFeedback(new Feedback(str, str2, str3, str4));
    }

    public static class Feedback {
        final String debugInfo;
        final String label;
        final String mode;
        final String resultId;
        final StrokeList strokes;

        public Feedback(String str, StrokeList strokeList, String str2, String str3) {
            this.label = str;
            this.strokes = strokeList;
            this.resultId = null;
            this.mode = str2;
            this.debugInfo = str3;
        }

        public JSONObject asJsonObject(String str) throws JSONException {
            JSONObject jSONObject;
            if (this.resultId == null) {
                jSONObject = this.strokes.asJsonObject();
            } else {
                jSONObject = new JSONObject();
                jSONObject.put(CloudRecognizerProtocolStrings.INK_HASH, this.resultId);
            }
            jSONObject.put("language", str);
            jSONObject.put(CloudRecognizerProtocolStrings.FEEDBACK, this.label);
            String str2 = this.debugInfo;
            if (str2 != null && str2.length() > 0) {
                jSONObject.put(CloudRecognizerProtocolStrings.DEBUG_INFO, str2);
            }
            jSONObject.put(CloudRecognizerProtocolStrings.SELECT_TYPE, this.mode);
            return jSONObject;
        }

        public Feedback(String str, String str2, String str3, String str4) {
            this.label = str;
            this.strokes = null;
            this.resultId = str2;
            this.mode = str3;
            this.debugInfo = str4;
        }
    }

    public CloudRecognizer(ajqy ajqyVar, CloudRecognizerSettings cloudRecognizerSettings) {
        this.feedbacks = new ArrayList();
        this.httpClient = ajqyVar;
        this.settings = cloudRecognizerSettings;
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public void setSecondaryRecognizer(HandwritingRecognizer handwritingRecognizer) {
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public void setSendingFeedback(boolean z) {
    }

    public String buildFeedbackRequest(String str, StrokeList strokeList, String str2, String str3) throws JSONException {
        return buildFeedbackRequest(new Feedback(str, strokeList, str2, str3));
    }
}
