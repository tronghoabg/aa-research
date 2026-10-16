package androidx.compose.foundation.shape;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public class a {
    static /* synthetic */ String a(CornerBasedShape cornerBasedShape, StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str4);
        sb.append(cornerBasedShape.getTopStart());
        sb.append(str);
        sb.append(cornerBasedShape.getTopEnd());
        sb.append(str2);
        sb.append(cornerBasedShape.getBottomEnd());
        sb.append(str3);
        sb.append(cornerBasedShape.getBottomStart());
        sb.append(')');
        return sb.toString();
    }
}
