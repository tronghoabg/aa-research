package com.google.android.libraries.handwriting.base;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class RecognitionResult implements Iterable<ScoredCandidate>, Parcelable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int STROKES_IN_PARCEL = 1;
    private String debugInfo;
    private ExtraInfo extraInfo;
    private int firstStrokeId;
    private final String inkHash;
    private int lastStrokeId;
    private long recognitionEndedTime;
    private long recognitionStartedTime;
    private StrokeList recognizedStrokes;
    private int requestId;
    private final List<ScoredCandidate> scoredResults;
    private final List<SegmentationInfo> segmentationInfo;
    public static final RecognitionResult EMPTY = new RecognitionResult("");
    public static final Parcelable.Creator<RecognitionResult> CREATOR = new Parcelable.Creator<RecognitionResult>() { // from class: com.google.android.libraries.handwriting.base.RecognitionResult.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RecognitionResult createFromParcel(Parcel parcel) {
            return new RecognitionResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RecognitionResult[] newArray(int i) {
            return new RecognitionResult[i];
        }
    };

    public interface ExtraInfo extends Parcelable {
    }

    public RecognitionResult(String[] strArr, float[] fArr, String[][] strArr2, int[][][][] iArr) {
        this.debugInfo = null;
        this.extraInfo = null;
        this.firstStrokeId = 0;
        this.lastStrokeId = 0;
        this.recognizedStrokes = StrokeList.EMPTY;
        this.inkHash = "";
        this.scoredResults = new ArrayList();
        for (int i = 0; i < strArr.length; i++) {
            this.scoredResults.add(new ScoredCandidate(strArr[i], fArr[i]));
        }
        this.segmentationInfo = new ArrayList();
        if (strArr2 == null || iArr == null) {
            return;
        }
        for (int i2 = 0; i2 < strArr2.length; i2++) {
            this.segmentationInfo.add(new SegmentationInfo(strArr2[i2], iArr[i2]));
        }
    }

    public void add(ScoredCandidate scoredCandidate) {
        this.scoredResults.add(scoredCandidate);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x014f, code lost:
    
        r9 = r9 + 1;
        r3 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.libraries.handwriting.base.RecognitionResult createResultWithoutLastSegment() {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.handwriting.base.RecognitionResult.createResultWithoutLastSegment():com.google.android.libraries.handwriting.base.RecognitionResult");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ScoredCandidate get(int i) {
        return this.scoredResults.get(i);
    }

    public List<ScoredCandidate> getCandidateList() {
        return this.scoredResults;
    }

    public String getDebugInfo() {
        return this.debugInfo;
    }

    public ExtraInfo getExtraInfo() {
        return this.extraInfo;
    }

    public int getFirstStrokeId() {
        return this.firstStrokeId;
    }

    public String getId() {
        return this.inkHash;
    }

    public String getInkHash() {
        String str = this.inkHash;
        return str == null ? "" : str;
    }

    public int getLastStrokeId() {
        return this.lastStrokeId;
    }

    public long getRecognitionEndedTime() {
        return this.recognitionEndedTime;
    }

    public long getRecognitionStartedTime() {
        return this.recognitionStartedTime;
    }

    public int getRequestId() {
        return this.requestId;
    }

    public List<SegmentationInfo> getSegmentationInfo() {
        return this.segmentationInfo;
    }

    public StrokeList getStrokes() {
        return this.recognizedStrokes;
    }

    public boolean hasExtraInfo() {
        return this.extraInfo != null;
    }

    @Override // java.lang.Iterable
    public Iterator<ScoredCandidate> iterator() {
        return this.scoredResults.iterator();
    }

    public int numResult() {
        return this.scoredResults.size();
    }

    public void set(int i, ScoredCandidate scoredCandidate) {
        if (i < 0 || i >= this.scoredResults.size()) {
            return;
        }
        this.scoredResults.set(i, scoredCandidate);
    }

    public void setDebugInfo(String str) {
        this.debugInfo = str;
    }

    public void setExtraInfo(ExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
    }

    public void setFirstStrokeId(int i) {
        this.firstStrokeId = i;
    }

    public void setLastStrokeId(int i) {
        this.lastStrokeId = i;
    }

    public void setRecognitionEndedTime(long j) {
        this.recognitionEndedTime = j;
    }

    public void setRecognitionStartedTime(long j) {
        this.recognitionStartedTime = j;
    }

    public void setRequestId(int i) {
        this.requestId = i;
    }

    public void setStrokes(StrokeList strokeList) {
        this.recognizedStrokes = strokeList;
    }

    public void sort() {
        Collections.sort(this.scoredResults, new Comparator<ScoredCandidate>(this) { // from class: com.google.android.libraries.handwriting.base.RecognitionResult.2
            {
                this.getClass();
            }

            @Override // java.util.Comparator
            public int compare(ScoredCandidate scoredCandidate, ScoredCandidate scoredCandidate2) {
                return (int) Math.signum(scoredCandidate.score - scoredCandidate2.score);
            }
        });
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RequestId: ");
        sb.append(this.requestId);
        sb.append(" First result: ");
        sb.append(!this.scoredResults.isEmpty() ? this.scoredResults.get(0).word : "EMPTY RESULT");
        sb.append(" inkhash: ");
        sb.append(this.inkHash);
        sb.append(" numStrokes: ");
        sb.append(this.recognizedStrokes.size());
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.inkHash);
        String str = this.debugInfo;
        if (str == null) {
            parcel.writeString("");
        } else {
            parcel.writeString(str);
        }
        parcel.writeTypedList(this.scoredResults);
        parcel.writeTypedList(this.segmentationInfo);
        StrokeList strokeList = this.recognizedStrokes;
        if (strokeList == null || strokeList == StrokeList.EMPTY) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            this.recognizedStrokes.writeToParcel(parcel, i);
        }
    }

    public static class InkRange implements Parcelable {
        public static final Parcelable.Creator<InkRange> CREATOR = new Parcelable.Creator<InkRange>() { // from class: com.google.android.libraries.handwriting.base.RecognitionResult.InkRange.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public InkRange createFromParcel(Parcel parcel) {
                return new InkRange(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public InkRange[] newArray(int i) {
                return new InkRange[i];
            }
        };
        public final int endPoint;
        public final int endStroke;
        public final int startPoint;
        public final int startStroke;

        public InkRange(Parcel parcel) {
            this.startStroke = parcel.readInt();
            this.startPoint = parcel.readInt();
            this.endStroke = parcel.readInt();
            this.endPoint = parcel.readInt();
        }

        public int[] asIntArray() {
            return new int[]{this.startStroke, this.startPoint, this.endStroke, this.endPoint};
        }

        public boolean containsPoint(int i, int i2) {
            int i3 = this.startStroke;
            if (i <= i3 && (i != i3 || i2 < this.startPoint)) {
                return false;
            }
            int i4 = this.endStroke;
            if (i >= i4) {
                return i == i4 && i2 <= this.endPoint;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.startStroke);
            parcel.writeInt(this.startPoint);
            parcel.writeInt(this.endStroke);
            parcel.writeInt(this.endPoint);
        }

        public InkRange(int[] iArr) {
            this.startStroke = iArr[0];
            this.startPoint = iArr[1];
            this.endStroke = iArr[2];
            this.endPoint = iArr[3];
        }
    }

    public static class Segment implements Parcelable {
        public static final Parcelable.Creator<Segment> CREATOR = new Parcelable.Creator<Segment>() { // from class: com.google.android.libraries.handwriting.base.RecognitionResult.Segment.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Segment createFromParcel(Parcel parcel) {
                return new Segment(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Segment[] newArray(int i) {
                return new Segment[i];
            }
        };
        final InkRange[] inkRange;
        final String subString;

        public Segment(String str, int[][] iArr) {
            this.subString = str;
            int length = iArr.length;
            this.inkRange = new InkRange[length];
            for (int i = 0; i < length; i++) {
                this.inkRange[i] = new InkRange(iArr[i]);
            }
        }

        public boolean containsPoint(int i, int i2) {
            for (InkRange inkRange : this.inkRange) {
                if (inkRange.containsPoint(i, i2)) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public InkRange getInkRange(int i) {
            return this.inkRange[i];
        }

        public int getNumInkRanges() {
            return this.inkRange.length;
        }

        public String getSubString() {
            return this.subString;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.subString);
            parcel.writeInt(this.inkRange.length);
            parcel.writeTypedArray(this.inkRange, 0);
        }

        public Segment(Parcel parcel) {
            this.subString = parcel.readString();
            InkRange[] inkRangeArr = new InkRange[parcel.readInt()];
            this.inkRange = inkRangeArr;
            parcel.readTypedArray(inkRangeArr, InkRange.CREATOR);
        }
    }

    public static class SegmentationInfo implements Parcelable {
        public static final Parcelable.Creator<SegmentationInfo> CREATOR = new Parcelable.Creator<SegmentationInfo>() { // from class: com.google.android.libraries.handwriting.base.RecognitionResult.SegmentationInfo.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SegmentationInfo createFromParcel(Parcel parcel) {
                return new SegmentationInfo(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SegmentationInfo[] newArray(int i) {
                return new SegmentationInfo[i];
            }
        };
        final Segment[] segment;

        public SegmentationInfo(String[] strArr, int[][][] iArr) {
            int length = strArr.length;
            this.segment = new Segment[length];
            for (int i = 0; i < length; i++) {
                this.segment[i] = new Segment(strArr[i], iArr[i]);
            }
        }

        public boolean containsPoint(int i, int i2) {
            for (Segment segment : this.segment) {
                if (segment.containsPoint(i, i2)) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public int getNumSegments() {
            return this.segment.length;
        }

        public Segment getSegment(int i) {
            return this.segment[i];
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.segment.length);
            parcel.writeTypedArray(this.segment, 0);
        }

        public SegmentationInfo(Parcel parcel) {
            Segment[] segmentArr = new Segment[parcel.readInt()];
            this.segment = segmentArr;
            parcel.readTypedArray(segmentArr, Segment.CREATOR);
        }

        public SegmentationInfo(Segment[] segmentArr) {
            this.segment = segmentArr;
        }
    }

    public RecognitionResult(Parcel parcel) {
        this.debugInfo = null;
        this.extraInfo = null;
        this.firstStrokeId = 0;
        this.lastStrokeId = 0;
        this.recognizedStrokes = StrokeList.EMPTY;
        this.inkHash = parcel.readString();
        this.debugInfo = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.scoredResults = arrayList;
        parcel.readTypedList(arrayList, ScoredCandidate.CREATOR);
        ArrayList arrayList2 = new ArrayList();
        this.segmentationInfo = arrayList2;
        parcel.readTypedList(arrayList2, SegmentationInfo.CREATOR);
        if (parcel.readInt() == 1) {
            this.recognizedStrokes = new StrokeList(parcel);
        }
    }

    public RecognitionResult(String str) {
        this(str, new ArrayList());
    }

    public RecognitionResult(String str, List<ScoredCandidate> list) {
        this(str, list, new ArrayList());
    }

    public RecognitionResult(String str, List<ScoredCandidate> list, List<SegmentationInfo> list2) {
        this.debugInfo = null;
        this.extraInfo = null;
        this.firstStrokeId = 0;
        this.lastStrokeId = 0;
        this.recognizedStrokes = StrokeList.EMPTY;
        this.inkHash = str;
        this.scoredResults = list;
        this.segmentationInfo = list2;
    }

    public RecognitionResult(String[] strArr, float[] fArr) {
        this(strArr, fArr, null, null);
    }

    public RecognitionResult() {
        this("");
    }
}
