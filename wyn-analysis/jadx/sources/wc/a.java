package wc;

import Nc.d;
import android.view.PointerIcon;
import ba.C1521a;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import j$.util.Map;
import kc.r;
import org.apache.tika.mime.MimeTypesReaderMetKeys;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1521a f47458a;

    public a(C1521a c1521a) {
        this.f47458a = c1521a;
    }

    public final void a(String str) {
        C1521a c1521a = this.f47458a;
        r rVar = (r) c1521a.f19414b;
        if (C1521a.f19412e == null) {
            d dVar = new d();
            dVar.put(MimeTypesReaderMetKeys.ALIAS_TAG, Integer.valueOf(TTAdConstant.IMAGE_MODE_1010));
            dVar.put("allScroll", 1013);
            dVar.put("basic", 1000);
            dVar.put("cell", 1006);
            dVar.put("click", Integer.valueOf(BackupConstant.SCENE_BACKUP_RENDER_FAIL));
            dVar.put("contextMenu", 1001);
            dVar.put("copy", Integer.valueOf(TTAdConstant.IMAGE_MODE_1011));
            Integer numValueOf = Integer.valueOf(TTAdConstant.IMAGE_MODE_1012);
            dVar.put("forbidden", numValueOf);
            dVar.put("grab", 1020);
            dVar.put("grabbing", 1021);
            dVar.put("help", Integer.valueOf(BackupConstant.SCENE_CLOSED_WITHOUT_SHOW));
            dVar.put("move", 1013);
            dVar.put("none", 0);
            dVar.put("noDrop", numValueOf);
            dVar.put("precise", 1007);
            dVar.put("text", 1008);
            dVar.put("resizeColumn", 1014);
            dVar.put("resizeDown", 1015);
            dVar.put("resizeUpLeft", 1016);
            dVar.put("resizeDownRight", 1017);
            dVar.put("resizeLeft", 1014);
            dVar.put("resizeLeftRight", 1014);
            dVar.put("resizeRight", 1014);
            dVar.put("resizeRow", 1015);
            dVar.put("resizeUp", 1015);
            dVar.put("resizeUpDown", 1015);
            dVar.put("resizeUpLeft", 1017);
            dVar.put("resizeUpRight", 1016);
            dVar.put("resizeUpLeftDownRight", 1017);
            dVar.put("resizeUpRightDownLeft", 1016);
            dVar.put("verticalText", 1009);
            dVar.put("wait", 1004);
            dVar.put("zoomIn", 1018);
            dVar.put("zoomOut", 1019);
            C1521a.f19412e = dVar;
        }
        rVar.setPointerIcon(PointerIcon.getSystemIcon(((r) c1521a.f19414b).getContext(), ((Integer) Map.EL.getOrDefault(C1521a.f19412e, str, 1000)).intValue()));
    }
}
