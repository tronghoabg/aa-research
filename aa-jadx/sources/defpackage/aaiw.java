package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aaiw implements defpackage.abpd {
    public static final defpackage.abpd a = new defpackage.aaiw();

    /* JADX WARN: Code duplicated, block: B:384:0x05d2  */
    @Override // defpackage.abpd
    public final boolean a(int i) {
        defpackage.aaix aaixVar;
        if (i != 0) {
            switch (i) {
                case 0:
                    aaixVar = defpackage.aaix.UNKNOWN_EVENT;
                    break;
                case 200:
                    aaixVar = defpackage.aaix.MAP_ADD_MARKER;
                    break;
                case 201:
                    aaixVar = defpackage.aaix.MARKER_REMOVE;
                    break;
                case 202:
                    aaixVar = defpackage.aaix.MARKER_SET_POSITION;
                    break;
                case 203:
                    aaixVar = defpackage.aaix.MARKER_TITLE;
                    break;
                case 204:
                    aaixVar = defpackage.aaix.MARKER_SNIPPET;
                    break;
                case 205:
                    aaixVar = defpackage.aaix.MARKER_ICON;
                    break;
                case 206:
                    aaixVar = defpackage.aaix.MARKER_ANCHOR;
                    break;
                case 207:
                    aaixVar = defpackage.aaix.MARKER_DRAGGABLE;
                    break;
                case 208:
                    aaixVar = defpackage.aaix.MARKER_WAS_DRAGGED;
                    break;
                case 209:
                    aaixVar = defpackage.aaix.MARKER_VISIBILITY;
                    break;
                case 210:
                    aaixVar = defpackage.aaix.MARKER_FLAT;
                    break;
                case 211:
                    aaixVar = defpackage.aaix.MARKER_ROTATION;
                    break;
                case 212:
                    aaixVar = defpackage.aaix.MARKER_INFO_WINDOW_ANCHOR;
                    break;
                case 213:
                    aaixVar = defpackage.aaix.MARKER_ALPHA;
                    break;
                case 214:
                    aaixVar = defpackage.aaix.MARKER_SHOW_INFO_BUBBLE;
                    break;
                case 215:
                    aaixVar = defpackage.aaix.MARKER_HIDE_INFO_BUBBLE;
                    break;
                case 216:
                    aaixVar = defpackage.aaix.MARKER_SET_INFO_CONTENTS_ADAPTER;
                    break;
                case 217:
                    aaixVar = defpackage.aaix.MARKER_INFO_WINDOW_CLICK_WITH_LISTENER;
                    break;
                case 218:
                    aaixVar = defpackage.aaix.MARKER_INFO_WINDOW_CLICK_WITHOUT_LISTENER;
                    break;
                case 219:
                    aaixVar = defpackage.aaix.MARKER_CLICK_WITH_LISTENER;
                    break;
                case 220:
                    aaixVar = defpackage.aaix.MARKER_CLICK_WITH_INTERRUPTING_LISTENER;
                    break;
                case 221:
                    aaixVar = defpackage.aaix.MARKER_CLICK_WITHOUT_LISTENER;
                    break;
                case 222:
                    aaixVar = defpackage.aaix.OBSOLETE_MARKER_SHOW_INFO_BUBBLE_CONTENTS;
                    break;
                case 223:
                    aaixVar = defpackage.aaix.MARKER_INFO_WINDOW_LONG_CLICK_WITH_LISTENER;
                    break;
                case 224:
                    aaixVar = defpackage.aaix.MARKER_INFO_WINDOW_LONG_CLICK_WITHOUT_LISTENER;
                    break;
                case 225:
                    aaixVar = defpackage.aaix.MARKER_INFO_WINDOW_CLOSE_WITH_LISTENER;
                    break;
                case 226:
                    aaixVar = defpackage.aaix.MARKER_INFO_WINDOW_CLOSE_WITHOUT_LISTENER;
                    break;
                case 227:
                    aaixVar = defpackage.aaix.MARKER_SET_TAG;
                    break;
                case 228:
                    aaixVar = defpackage.aaix.MARKER_Z_INDEX;
                    break;
                case 229:
                    aaixVar = defpackage.aaix.MARKER_COLLISION_BEHAVIOR;
                    break;
                case 230:
                    aaixVar = defpackage.aaix.MARKER_COLLISION_BEHAVIOR_IOS;
                    break;
                case 231:
                    aaixVar = defpackage.aaix.MARKER_CONTENT_DESCRIPTION;
                    break;
                case 1100:
                    aaixVar = defpackage.aaix.MAP_CLEAR;
                    break;
                case 1101:
                    aaixVar = defpackage.aaix.MAP_SET_MAP_TYPE;
                    break;
                case 1102:
                    aaixVar = defpackage.aaix.MAP_SET_TRAFFIC_DISABLED;
                    break;
                case 1103:
                    aaixVar = defpackage.aaix.MAP_SET_TRAFFIC_ENABLED;
                    break;
                case 1104:
                    aaixVar = defpackage.aaix.MAP_SET_TRANSIT_DISABLED;
                    break;
                case 1105:
                    aaixVar = defpackage.aaix.MAP_SET_TRANSIT_ENABLED;
                    break;
                case 1106:
                    aaixVar = defpackage.aaix.MAP_SET_MY_LOCATION_DISABLED;
                    break;
                case 1107:
                    aaixVar = defpackage.aaix.MAP_SET_MY_LOCATION_ENABLED;
                    break;
                case 1108:
                    aaixVar = defpackage.aaix.MAP_SET_BUILDINGS_DISABLED;
                    break;
                case 1109:
                    aaixVar = defpackage.aaix.MAP_SET_BUILDINGS_ENABLED;
                    break;
                case 1120:
                    aaixVar = defpackage.aaix.MAP_SET_MAP_TYPE_NONE;
                    break;
                case 1121:
                    aaixVar = defpackage.aaix.MAP_SET_MAP_TYPE_NORMAL;
                    break;
                case 1122:
                    aaixVar = defpackage.aaix.MAP_SET_MAP_TYPE_SATELLITE;
                    break;
                case 1123:
                    aaixVar = defpackage.aaix.MAP_SET_MAP_TYPE_TERRAIN;
                    break;
                case 1124:
                    aaixVar = defpackage.aaix.MAP_SET_MAP_TYPE_HYBRID;
                    break;
                case 1200:
                    aaixVar = defpackage.aaix.MAP_CLEAR_LOCATION_SOURCE;
                    break;
                case 1201:
                    aaixVar = defpackage.aaix.MAP_GET_MY_LOCATION;
                    break;
                case 1202:
                    aaixVar = defpackage.aaix.MAP_SET_LOCATION_SOURCE;
                    break;
                case 1203:
                    aaixVar = defpackage.aaix.MAP_SET_ON_MY_LOCATION_CHANGE_LISTENER;
                    break;
                case 1204:
                    aaixVar = defpackage.aaix.MAP_SET_ON_MY_LOCATION_BUTTON_CLICK_LISTENER;
                    break;
                case 1205:
                    aaixVar = defpackage.aaix.MAP_SET_FOLLOW_MY_LOCATION_ENABLED;
                    break;
                case 1206:
                    aaixVar = defpackage.aaix.MAP_SET_FOLLOW_MY_LOCATION_DISABLED;
                    break;
                case 1207:
                    aaixVar = defpackage.aaix.MAP_SET_ON_MY_LOCATION_CLICK_LISTENER;
                    break;
                case 1208:
                    aaixVar = defpackage.aaix.MY_LOCATION_CLICK_WITH_LISTENER;
                    break;
                case 1209:
                    aaixVar = defpackage.aaix.MY_LOCATION_CLICK_WITHOUT_LISTENER;
                    break;
                case 1300:
                    aaixVar = defpackage.aaix.MAP_SET_ON_BUBBLE_CLICK_LISTENER;
                    break;
                case 1301:
                    aaixVar = defpackage.aaix.MAP_SET_ON_BUBBLE_DOUBLE_CLICK_LISTENER;
                    break;
                case 1302:
                    aaixVar = defpackage.aaix.MAP_SET_ON_CAMERA_CHANGE_LISTENER;
                    break;
                case 1303:
                    aaixVar = defpackage.aaix.MAP_SET_ON_INDOOR_LISTENER;
                    break;
                case 1304:
                    aaixVar = defpackage.aaix.OBSOLETE_MAP_SET_ON_MAP_GESTURE_LISTENER;
                    break;
                case 1305:
                    aaixVar = defpackage.aaix.MAP_SET_ON_MAP_CLICK_LISTENER;
                    break;
                case 1306:
                    aaixVar = defpackage.aaix.MAP_SET_ON_MAP_LONG_CLICK_LISTENER;
                    break;
                case 1307:
                    aaixVar = defpackage.aaix.MAP_SET_ON_MARKER_CLICK_LISTENER;
                    break;
                case 1308:
                    aaixVar = defpackage.aaix.MAP_SET_ON_MARKER_DRAG_LISTENER;
                    break;
                case 1309:
                    aaixVar = defpackage.aaix.MAP_SET_ON_MAP_IDLE_LISTENER;
                    break;
                case 1310:
                    aaixVar = defpackage.aaix.MAP_SET_ON_GROUND_OVERLAY_CLICK_LISTENER;
                    break;
                case 1311:
                    aaixVar = defpackage.aaix.MAP_SET_ON_BUBBLE_LONG_CLICK_LISTENER;
                    break;
                case 1312:
                    aaixVar = defpackage.aaix.MAP_SET_ON_BUBBLE_CLOSE_LISTENER;
                    break;
                case 1313:
                    aaixVar = defpackage.aaix.MAP_SET_ON_POLYGON_CLICK_LISTENER;
                    break;
                case 1314:
                    aaixVar = defpackage.aaix.MAP_SET_ON_POLYLINE_CLICK_LISTENER;
                    break;
                case 1315:
                    aaixVar = defpackage.aaix.MAP_SET_ON_CIRCLE_CLICK_LISTENER;
                    break;
                case 1316:
                    aaixVar = defpackage.aaix.MAP_SET_ON_CAMERA_IDLE_LISTENER;
                    break;
                case 1317:
                    aaixVar = defpackage.aaix.MAP_SET_ON_CAMERA_MOVE_CANCELED_LISTENER;
                    break;
                case 1318:
                    aaixVar = defpackage.aaix.MAP_SET_ON_CAMERA_MOVE_LISTENER;
                    break;
                case 1319:
                    aaixVar = defpackage.aaix.MAP_SET_ON_CAMERA_MOVE_STARTED_LISTENER;
                    break;
                case 1400:
                    aaixVar = defpackage.aaix.COMPASS_BUTTON_CLICK;
                    break;
                case 1401:
                    aaixVar = defpackage.aaix.MAP_DISABLE_COMPASS;
                    break;
                case 1402:
                    aaixVar = defpackage.aaix.MAP_DISABLE_MY_LOCATION_BUTTON;
                    break;
                case 1403:
                    aaixVar = defpackage.aaix.MAP_DISABLE_ZOOM_CONTROLS;
                    break;
                case 1404:
                    aaixVar = defpackage.aaix.MAP_ENABLE_COMPASS;
                    break;
                case 1405:
                    aaixVar = defpackage.aaix.MAP_ENABLE_MY_LOCATION_BUTTON;
                    break;
                case 1406:
                    aaixVar = defpackage.aaix.MAP_ENABLE_ZOOM_CONTROLS;
                    break;
                case 1407:
                    aaixVar = defpackage.aaix.MY_LOCATION_BUTTON_CLICK;
                    break;
                case 1408:
                    aaixVar = defpackage.aaix.GOOGLE_LOGO_CLICK;
                    break;
                case 1409:
                    aaixVar = defpackage.aaix.ZOOM_IN_BUTTON_CLICK;
                    break;
                case 1410:
                    aaixVar = defpackage.aaix.ZOOM_OUT_BUTTON_CLICK;
                    break;
                case 1411:
                    aaixVar = defpackage.aaix.MAP_ENABLE_SCROLL;
                    break;
                case 1412:
                    aaixVar = defpackage.aaix.MAP_DISABLE_SCROLL;
                    break;
                case 1413:
                    aaixVar = defpackage.aaix.MAP_ENABLE_ZOOM;
                    break;
                case 1414:
                    aaixVar = defpackage.aaix.MAP_DISABLE_ZOOM;
                    break;
                case 1415:
                    aaixVar = defpackage.aaix.MAP_ENABLE_ROTATE;
                    break;
                case 1416:
                    aaixVar = defpackage.aaix.MAP_DISABLE_ROTATE;
                    break;
                case 1417:
                    aaixVar = defpackage.aaix.MAP_ENABLE_TILT;
                    break;
                case 1418:
                    aaixVar = defpackage.aaix.MAP_DISABLE_TILT;
                    break;
                case 1419:
                    aaixVar = defpackage.aaix.MAP_ENABLE_ALL_GESTURES;
                    break;
                case 1420:
                    aaixVar = defpackage.aaix.MAP_DISABLE_ALL_GESTURES;
                    break;
                case 1421:
                    aaixVar = defpackage.aaix.MAP_ENABLE_MAP_TOOLBAR;
                    break;
                case 1422:
                    aaixVar = defpackage.aaix.MAP_DISABLE_MAP_TOOLBAR;
                    break;
                case 1423:
                    aaixVar = defpackage.aaix.MAP_ENABLE_SCROLL_DURING_ROTATE_OR_ZOOM;
                    break;
                case 1424:
                    aaixVar = defpackage.aaix.MAP_DISABLE_SCROLL_DURING_ROTATE_OR_ZOOM;
                    break;
                case 1500:
                    aaixVar = defpackage.aaix.MAP_SET_INFO_WINDOW;
                    break;
                case 1600:
                    aaixVar = defpackage.aaix.MAP_GET_PROJECTION;
                    break;
                case 1601:
                    aaixVar = defpackage.aaix.PROJECTION_FROM_SCREEN_LOCATION;
                    break;
                case 1602:
                    aaixVar = defpackage.aaix.PROJECTION_GET_FRUSTUM;
                    break;
                case 1603:
                    aaixVar = defpackage.aaix.PROJECTION_TO_SCREEN_LOCATION;
                    break;
                case 1604:
                    aaixVar = defpackage.aaix.PROJECTION_TO_SCREEN_LOCATION_WITH_ALTITUDE;
                    break;
                case 1700:
                    aaixVar = defpackage.aaix.KEYBOARD_UP;
                    break;
                case 1701:
                    aaixVar = defpackage.aaix.KEYBOARD_DOWN;
                    break;
                case 1702:
                    aaixVar = defpackage.aaix.KEYBOARD_LEFT;
                    break;
                case 1703:
                    aaixVar = defpackage.aaix.KEYBOARD_RIGHT;
                    break;
                case 1800:
                    aaixVar = defpackage.aaix.MAP_ENABLE_INDOOR;
                    break;
                case 1801:
                    aaixVar = defpackage.aaix.MAP_DISABLE_INDOOR;
                    break;
                case 1802:
                    aaixVar = defpackage.aaix.MAP_ENABLE_INDOOR_LEVEL_PICKER;
                    break;
                case 1803:
                    aaixVar = defpackage.aaix.MAP_DISABLE_INDOOR_LEVEL_PICKER;
                    break;
                case 1804:
                    aaixVar = defpackage.aaix.INDOOR_ACTIVATE_LEVEL;
                    break;
                case 1805:
                    aaixVar = defpackage.aaix.INDOOR_GET_ACTIVE_LEVEL;
                    break;
                case 1806:
                    aaixVar = defpackage.aaix.INDOOR_GET_FOCUSED_BUILDING;
                    break;
                case 1807:
                    aaixVar = defpackage.aaix.INDOOR_GET_LEVELS;
                    break;
                case 1808:
                    aaixVar = defpackage.aaix.INDOOR_GET_VISIBLE_BUILDINGS;
                    break;
                case 1809:
                    aaixVar = defpackage.aaix.INDOOR_GET_DEFAULT_LEVEL;
                    break;
                case 1810:
                    aaixVar = defpackage.aaix.INDOOR_IS_UNDERGROUND;
                    break;
                case 1900:
                    aaixVar = defpackage.aaix.MAP_REQUEST_TILE_PREFETCH_AREA;
                    break;
                case 1901:
                    aaixVar = defpackage.aaix.MAP_SET_EXTERNAL_CACHE;
                    break;
                case 1902:
                    aaixVar = defpackage.aaix.MAP_CLEAR_EXTERNAL_CACHE;
                    break;
                case 1903:
                    aaixVar = defpackage.aaix.MAP_SET_NETWORK_ENABLED;
                    break;
                case 1904:
                    aaixVar = defpackage.aaix.MAP_SET_NETWORK_DISABLED;
                    break;
                case 2000:
                    aaixVar = defpackage.aaix.MAP_SNAPSHOT;
                    break;
                case 2001:
                    aaixVar = defpackage.aaix.MAP_SNAPSHOT_ALLOCATED_BITMAP;
                    break;
                case 2100:
                    aaixVar = defpackage.aaix.PANORAMA_CREATED;
                    break;
                case 2101:
                    aaixVar = defpackage.aaix.PANORAMA_ADD_MARKER;
                    break;
                case 2102:
                    aaixVar = defpackage.aaix.PANORAMA_REMOVE_MARKER;
                    break;
                case 2103:
                    aaixVar = defpackage.aaix.PANORAMA_ENABLE_ZOOM;
                    break;
                case 2104:
                    aaixVar = defpackage.aaix.PANORAMA_ENABLE_PANNING;
                    break;
                case 2105:
                    aaixVar = defpackage.aaix.PANORAMA_ENABLE_NAVIGATION;
                    break;
                case 2106:
                    aaixVar = defpackage.aaix.PANORAMA_ENABLE_STREET_NAMES;
                    break;
                case 2107:
                    aaixVar = defpackage.aaix.PANORAMA_ANIMATE_TO;
                    break;
                case 2108:
                    aaixVar = defpackage.aaix.PANORAMA_SET_POSITION_WITH_ID;
                    break;
                case 2109:
                    aaixVar = defpackage.aaix.PANORAMA_SET_POSITION;
                    break;
                case 2110:
                    aaixVar = defpackage.aaix.PANORAMA_SET_POSITION_WITH_RADIUS;
                    break;
                case 2111:
                    aaixVar = defpackage.aaix.PANORAMA_SET_CHANGE_LISTENER;
                    break;
                case 2112:
                    aaixVar = defpackage.aaix.PANORAMA_SET_CAMERA_CHANGE_LISTENER;
                    break;
                case 2113:
                    aaixVar = defpackage.aaix.PANORAMA_SET_CLICK_LISTENER;
                    break;
                case 2114:
                    aaixVar = defpackage.aaix.PANORAMA_PROJECT_TO_ORIENTATION;
                    break;
                case 2115:
                    aaixVar = defpackage.aaix.PANORAMA_PROJECT_TO_POINT;
                    break;
                case 2116:
                    aaixVar = defpackage.aaix.PANORAMA_SET_ON_PANORAMA_READY_CALLBACK;
                    break;
                case 2117:
                    aaixVar = defpackage.aaix.PANORAMA_SET_LONG_CLICK_LISTENER;
                    break;
                case 2118:
                    aaixVar = defpackage.aaix.PANORAMA_SET_POSITION_WITH_SOURCE_DEFAULT;
                    break;
                case 2119:
                    aaixVar = defpackage.aaix.PANORAMA_SET_POSITION_WITH_RADIUS_AND_SOURCE_DEFAULT;
                    break;
                case 2120:
                    aaixVar = defpackage.aaix.PANORAMA_SET_POSITION_WITH_SOURCE_OUTDOOR;
                    break;
                case 2121:
                    aaixVar = defpackage.aaix.PANORAMA_SET_POSITION_WITH_RADIUS_AND_SOURCE_OUTDOOR;
                    break;
                case 2122:
                    aaixVar = defpackage.aaix.PANORAMA_RENDERED;
                    break;
                case 2123:
                    aaixVar = defpackage.aaix.PANORAMA_USER_REPORTED_PROBLEM;
                    break;
                case 2124:
                    aaixVar = defpackage.aaix.PANORAMA_HANDLE_MEMORY_WARNING;
                    break;
                case 2200:
                    aaixVar = defpackage.aaix.MAP_SET_VISIBLE_REGION;
                    break;
                case 2300:
                    aaixVar = defpackage.aaix.MAP_SET_OAUTH_TOKEN_PROVIDER;
                    break;
                case 2400:
                    aaixVar = defpackage.aaix.INTENT_VIEW_NO_MARKERS;
                    break;
                case 2401:
                    aaixVar = defpackage.aaix.INTENT_VIEW_ONE_MARKER;
                    break;
                case 2402:
                    aaixVar = defpackage.aaix.INTENT_VIEW_MULTIPLE_MARKERS_ONE_SELECTED;
                    break;
                case 2403:
                    aaixVar = defpackage.aaix.INTENT_VIEW_MULTIPLE_MARKERS_NONE_SELECTED;
                    break;
                case 2404:
                    aaixVar = defpackage.aaix.INTENT_DIRECTIONS;
                    break;
                case 2500:
                    aaixVar = defpackage.aaix.MAP_ENABLE_AMBIENT_STYLING;
                    break;
                case 2600:
                    aaixVar = defpackage.aaix.MAP_SET_STYLE;
                    break;
                case 2601:
                    aaixVar = defpackage.aaix.MAP_SET_STYLE_ILLEGAL_ARGUMENT;
                    break;
                case 2602:
                    aaixVar = defpackage.aaix.MAP_SET_STYLE_INVALID_STYLE;
                    break;
                case 2603:
                    aaixVar = defpackage.aaix.MAP_SET_STYLE_NULL;
                    break;
                case 2604:
                    aaixVar = defpackage.aaix.MAP_SET_STYLE_WITH_MAP_ID;
                    break;
                case 2700:
                    aaixVar = defpackage.aaix.RENDERER_STREETVIEW_ONLY_ONE_RENDERER;
                    break;
                case 2701:
                    aaixVar = defpackage.aaix.RENDERER_STREETVIEW_SERVER_INVALID;
                    break;
                case 2702:
                    aaixVar = defpackage.aaix.RENDERER_STREETVIEW_SERVER_UNKNOWN;
                    break;
                case 2703:
                    aaixVar = defpackage.aaix.RENDERER_STREETVIEW_SERVER_BLACKLIST;
                    break;
                case 2704:
                    aaixVar = defpackage.aaix.RENDERER_STREETVIEW_SERVER_FORCE_NEW;
                    break;
                case 2705:
                    aaixVar = defpackage.aaix.RENDERER_STREETVIEW_CLIENT_ATTEMPT_ROCKET;
                    break;
                case 2706:
                    aaixVar = defpackage.aaix.RENDERER_STREETVIEW_CLIENT_FALLBACK_GMM6;
                    break;
                case 2707:
                    aaixVar = defpackage.aaix.RENDERER_STREETVIEW_CLIENT_CHOOSE_ROCKET_ALWAYS;
                    break;
                case 2708:
                    aaixVar = defpackage.aaix.RENDERER_STREETVIEW_CLIENT_SET_ROCKET_ALWAYS;
                    break;
                case 2800:
                    aaixVar = defpackage.aaix.MAP_MAPID;
                    break;
                case 2801:
                    aaixVar = defpackage.aaix.MAP_TIER_CHANGED;
                    break;
                case 2802:
                    aaixVar = defpackage.aaix.MAP_READY_LEGENDARY;
                    break;
                case 2803:
                    aaixVar = defpackage.aaix.MAP_USE_CLOUD_STYLING;
                    break;
                case 2900:
                    aaixVar = defpackage.aaix.MAP_ADD_POLYLINE_GROUP;
                    break;
                case 2901:
                    aaixVar = defpackage.aaix.POLYLINE_GROUP_REMOVE;
                    break;
                case 3000:
                    aaixVar = defpackage.aaix.NAVIGATION_SET_DESTINATION;
                    break;
                case 3001:
                    aaixVar = defpackage.aaix.NAVIGATION_START_GUIDANCE;
                    break;
                case 3002:
                    aaixVar = defpackage.aaix.NAVIGATION_STOP_GUIDANCE;
                    break;
                case 3003:
                    aaixVar = defpackage.aaix.NAVIGATION_SERVICE_READY;
                    break;
                case 3004:
                    aaixVar = defpackage.aaix.NAVIGATION_REROUTE_REQUEST;
                    break;
                case 3005:
                    aaixVar = defpackage.aaix.NAVIGATION_HEARTBEAT_REQUEST;
                    break;
                case 3006:
                    aaixVar = defpackage.aaix.NAVIGATION_AUDIO_GUIDANCE_EVENT;
                    break;
                case 3007:
                    aaixVar = defpackage.aaix.NAVIGATION_PROMPT_GUIDANCE_EVENT;
                    break;
                case 3008:
                    aaixVar = defpackage.aaix.NAVIGATION_ROUTE_STATE_CHANGE_EVENT;
                    break;
                case 3009:
                    aaixVar = defpackage.aaix.NAVIGATION_LIFE_CYCLE;
                    break;
                case 3010:
                    aaixVar = defpackage.aaix.NAVIGATION_REALTIME_COUNTERS;
                    break;
                case 3011:
                    aaixVar = defpackage.aaix.NAVIGATION_ALL_BASEMAP_TILES_RENDERED;
                    break;
                case 3012:
                    aaixVar = defpackage.aaix.NAVIGATION_ALL_BASEMAP_LABELS_RENDERED;
                    break;
                case 3013:
                    aaixVar = defpackage.aaix.NAVIGATION_ALL_IDEAL_TILES_RENDERED;
                    break;
                case 3014:
                    aaixVar = defpackage.aaix.NAVIGATION_ALL_IDEAL_LABELS_RENDERED;
                    break;
                case 3100:
                    aaixVar = defpackage.aaix.MAP_ADD_ADVANCED_MARKER;
                    break;
                case 3101:
                    aaixVar = defpackage.aaix.ADVANCED_MARKER_REMOVE;
                    break;
                case 3102:
                    aaixVar = defpackage.aaix.ADVANCED_MARKER_ICON_VIEW;
                    break;
                case 3103:
                    aaixVar = defpackage.aaix.ADVANCED_MARKER_CUSTOMIZED_GLYPH_IMAGE;
                    break;
                case 3104:
                    aaixVar = defpackage.aaix.ADVANCED_MARKER_CUSTOMIZED_GLYPH_TEXT;
                    break;
                case 3105:
                    aaixVar = defpackage.aaix.ADVANCED_MARKER_CUSTOMIZED_BORDER_COLOR;
                    break;
                case 3106:
                    aaixVar = defpackage.aaix.ADVANCED_MARKER_CUSTOMIZED_BACKGROUND_COLOR;
                    break;
                case 3107:
                    aaixVar = defpackage.aaix.ADVANCED_MARKER_CUSTOMIZED_GLYPH_COLOR;
                    break;
                case 3108:
                    aaixVar = defpackage.aaix.ADVANCED_MARKER_MARKER_ALTITUDE;
                    break;
                case 3200:
                    aaixVar = defpackage.aaix.PREMIUM_QUOTA_REQUEST_FAILED;
                    break;
                case 3201:
                    aaixVar = defpackage.aaix.PREMIUM_QUOTA_REQUEST_EXCEEDED;
                    break;
                case 3202:
                    aaixVar = defpackage.aaix.PREMIUM_QUOTA_REQUEST_BLOCKED;
                    break;
                case 3203:
                    aaixVar = defpackage.aaix.PREMIUM_QUOTA_REQUEST_OK;
                    break;
                case 3204:
                    aaixVar = defpackage.aaix.QUOTA_REQUESTED;
                    break;
                case 3300:
                    aaixVar = defpackage.aaix.ONE_PLATFORM_DEDUCT_QUOTA_EVENT;
                    break;
                case 3301:
                    aaixVar = defpackage.aaix.DASH_CONNECTION_API_QUOTA_EVENT;
                    break;
                case 3302:
                    aaixVar = defpackage.aaix.ONE_PLATFORM_NAV_SDK_DEDUCT_QUOTA_EVENT;
                    break;
                case 3304:
                    aaixVar = defpackage.aaix.DASH_CONNECTION_NAV_SDK_API_QUOTA_EVENT;
                    break;
                case 3400:
                    aaixVar = defpackage.aaix.ONE_PLATFORM_REVERSE_GEOCODE_EVENT;
                    break;
                case 3401:
                    aaixVar = defpackage.aaix.DASH_CONNECTION_REVERSE_GEOCODE_EVENT;
                    break;
                case 3500:
                    aaixVar = defpackage.aaix.APOPHIS_CHAOS_TESTING_NAV_SDK;
                    break;
                case 3600:
                    aaixVar = defpackage.aaix.MAP_CAPABILITIES_CHANGED;
                    break;
                case 3601:
                    aaixVar = defpackage.aaix.MAP_CAPABILITIES_QUERIED;
                    break;
                case 3602:
                    aaixVar = defpackage.aaix.MAP_CAPABILITIES_SUBSCRIBED;
                    break;
                case 3700:
                    aaixVar = defpackage.aaix.MAP_GET_FEATURE_LAYER;
                    break;
                case 3701:
                    aaixVar = defpackage.aaix.FEATURE_LAYER_SET_STYLE;
                    break;
                case 3702:
                    aaixVar = defpackage.aaix.PLACE_FEATURE_ACCESS_PLACEID;
                    break;
                case 3703:
                    aaixVar = defpackage.aaix.PLACE_FEATURE_DISPLAY_NAME;
                    break;
                case 3704:
                    aaixVar = defpackage.aaix.FEATURE_STYLE_WITH_OPTIONS;
                    break;
                case 3705:
                    aaixVar = defpackage.aaix.FEATURE_LAYER_ADD_CLICK_LISTENER;
                    break;
                case 3800:
                    aaixVar = defpackage.aaix.MAP_COLD_START_WITHOUT_CACHES_TO_INITIAL_DISPLAY;
                    break;
                case 3801:
                    aaixVar = defpackage.aaix.MAP_COLD_START_WITHOUT_CACHES_TO_FULL_DISPLAY;
                    break;
                case 3802:
                    aaixVar = defpackage.aaix.MAP_COLD_START_WITHOUT_CACHES_TO_MAP_LOAD;
                    break;
                case 3803:
                    aaixVar = defpackage.aaix.MAP_COLD_START_WITH_CACHES_TO_INITIAL_DISPLAY;
                    break;
                case 3804:
                    aaixVar = defpackage.aaix.MAP_COLD_START_WITH_CACHES_TO_FULL_DISPLAY;
                    break;
                case 3805:
                    aaixVar = defpackage.aaix.MAP_COLD_START_WITH_CACHES_TO_MAP_LOAD;
                    break;
                case 3806:
                    aaixVar = defpackage.aaix.MAP_WARM_START_TO_INITIAL_DISPLAY;
                    break;
                case 3807:
                    aaixVar = defpackage.aaix.MAP_WARM_START_TO_FULL_DISPLAY;
                    break;
                case 3808:
                    aaixVar = defpackage.aaix.MAP_WARM_START_TO_MAP_LOAD;
                    break;
                case 3809:
                    aaixVar = defpackage.aaix.MAP_HOT_START_TO_INITIAL_DISPLAY;
                    break;
                case 3810:
                    aaixVar = defpackage.aaix.MAP_HOT_START_TO_FULL_DISPLAY;
                    break;
                case 3811:
                    aaixVar = defpackage.aaix.MAP_HOT_START_TO_MAP_LOAD;
                    break;
                case 3812:
                    aaixVar = defpackage.aaix.MAP_START_WITH_UNCAUGHT_EXCEPTION;
                    break;
                case 3900:
                    aaixVar = defpackage.aaix.MAP_SET_BACKGROUND_COLOR_POST_INIT;
                    break;
                case 4000:
                    aaixVar = defpackage.aaix.MAPS_CORE_MODULE_INSTALL;
                    break;
                case 4001:
                    aaixVar = defpackage.aaix.MAPS_API_TOKEN_REQUEST;
                    break;
                case 4002:
                    aaixVar = defpackage.aaix.MAPS_CORE_MODULE_INSTALL_REQUEST;
                    break;
                case 4100:
                    aaixVar = defpackage.aaix.METRIC_KIT_APP_EXIT_NORMAL;
                    break;
                case 4101:
                    aaixVar = defpackage.aaix.METRIC_KIT_APP_EXIT_ABNORMAL;
                    break;
                default:
                    switch (i) {
                        case 100:
                            aaixVar = defpackage.aaix.MAP_CREATED;
                            break;
                        case androidx.car.app.hardware.info.EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                            aaixVar = defpackage.aaix.MAP_SET_ZOOM_LIMIT;
                            break;
                        case 102:
                            aaixVar = defpackage.aaix.MAP_SET_ON_MAP_READY_CALLBACK;
                            break;
                        case 103:
                            aaixVar = defpackage.aaix.MAP_SET_FRAMERATE;
                            break;
                        case 104:
                            aaixVar = defpackage.aaix.MAP_READY;
                            break;
                        case 105:
                            aaixVar = defpackage.aaix.MAP_SET_BACKGROUND_COLOR;
                            break;
                        case 106:
                            aaixVar = defpackage.aaix.MAP_TILE_LOAD;
                            break;
                        case 107:
                            aaixVar = defpackage.aaix.MAP_LABEL_LOAD;
                            break;
                        case 108:
                            aaixVar = defpackage.aaix.MAP_FRAMERATE_SNAPSHOT;
                            break;
                        case 109:
                            aaixVar = defpackage.aaix.MAP_INITIALIZATION_REQUEST_DEFAULT;
                            break;
                        case 110:
                            aaixVar = defpackage.aaix.MAP_INITIALIZATION_REQUEST_OPT_IN;
                            break;
                        case 111:
                            aaixVar = defpackage.aaix.MAP_INITIALIZATION_REQUEST_OPT_OUT;
                            break;
                        case 112:
                            aaixVar = defpackage.aaix.MAP_INITIALIZATION_RESULT_LATEST;
                            break;
                        case 113:
                            aaixVar = defpackage.aaix.MAP_INITIALIZATION_RESULT_LEGACY;
                            break;
                        case 114:
                            aaixVar = defpackage.aaix.MAP_METAL_RENDERING;
                            break;
                        case 115:
                            aaixVar = defpackage.aaix.MAP_LIFE_CYCLE;
                            break;
                        case 116:
                            aaixVar = defpackage.aaix.MAP_REALTIME_COUNTERS;
                            break;
                        case 117:
                            aaixVar = defpackage.aaix.STYLED_MAP_READY;
                            break;
                        case 118:
                            aaixVar = defpackage.aaix.MAP_SET_DARK_MODE;
                            break;
                        case 119:
                            aaixVar = defpackage.aaix.MAP_FALLBACK_LITE_MODE;
                            break;
                        default:
                            switch (i) {
                                case 300:
                                    aaixVar = defpackage.aaix.MAP_ADD_POLYLINE;
                                    break;
                                case 301:
                                    aaixVar = defpackage.aaix.POLYLINE_REMOVE;
                                    break;
                                case 302:
                                    aaixVar = defpackage.aaix.POLYLINE_SET_POINTS;
                                    break;
                                case 303:
                                    aaixVar = defpackage.aaix.POLYLINE_WIDTH;
                                    break;
                                case 304:
                                    aaixVar = defpackage.aaix.POLYLINE_COLOR;
                                    break;
                                case 305:
                                    aaixVar = defpackage.aaix.POLYLINE_Z_INDEX;
                                    break;
                                case 306:
                                    aaixVar = defpackage.aaix.POLYLINE_VISIBILITY;
                                    break;
                                case 307:
                                    aaixVar = defpackage.aaix.POLYLINE_GEODESIC;
                                    break;
                                case 308:
                                    aaixVar = defpackage.aaix.POLYLINE_TEXTURE;
                                    break;
                                case 309:
                                    aaixVar = defpackage.aaix.POLYLINE_SPANS;
                                    break;
                                case 310:
                                    aaixVar = defpackage.aaix.POLYLINE_SPANS_GRADIENT;
                                    break;
                                case 311:
                                    aaixVar = defpackage.aaix.POLYLINE_SPANS_FRACTIONAL;
                                    break;
                                case 312:
                                    aaixVar = defpackage.aaix.POLYLINE_CLICK_WITH_LISTENER;
                                    break;
                                case 313:
                                    aaixVar = defpackage.aaix.POLYLINE_CLICK_WITHOUT_LISTENER;
                                    break;
                                case 314:
                                    aaixVar = defpackage.aaix.POLYLINE_CLICKABILITY;
                                    break;
                                case 315:
                                    aaixVar = defpackage.aaix.POLYLINE_START_CAP;
                                    break;
                                case 316:
                                    aaixVar = defpackage.aaix.POLYLINE_END_CAP;
                                    break;
                                case 317:
                                    aaixVar = defpackage.aaix.POLYLINE_JOINT_TYPE;
                                    break;
                                case 318:
                                    aaixVar = defpackage.aaix.POLYLINE_PATTERN;
                                    break;
                                case 319:
                                    aaixVar = defpackage.aaix.POLYLINE_SET_TAG;
                                    break;
                                case 320:
                                    aaixVar = defpackage.aaix.POLYLINE_RESET_POINTS;
                                    break;
                                case 321:
                                    aaixVar = defpackage.aaix.POLYLINE_SPANS_CHANGED;
                                    break;
                                case 322:
                                    aaixVar = defpackage.aaix.POLYLINE_SPANS_COUNT_CHANGED;
                                    break;
                                case 323:
                                    aaixVar = defpackage.aaix.POLYLINE_SPANS_SEGMENTS_CHANGED;
                                    break;
                                case 324:
                                    aaixVar = defpackage.aaix.POLYLINE_SPANS_COLOR_CHANGED;
                                    break;
                                case 325:
                                    aaixVar = defpackage.aaix.POLYLINE_SPANS_STAMP;
                                    break;
                                case 326:
                                    aaixVar = defpackage.aaix.POLYLINE_SPRITE;
                                    break;
                                default:
                                    switch (i) {
                                        case 400:
                                            aaixVar = defpackage.aaix.MAP_ADD_POLYGON;
                                            break;
                                        case 401:
                                            aaixVar = defpackage.aaix.POLYGON_REMOVE;
                                            break;
                                        case 402:
                                            aaixVar = defpackage.aaix.POLYGON_SET_POINTS;
                                            break;
                                        case 403:
                                            aaixVar = defpackage.aaix.POLYGON_HOLES;
                                            break;
                                        case 404:
                                            aaixVar = defpackage.aaix.POLYGON_WIDTH;
                                            break;
                                        case 405:
                                            aaixVar = defpackage.aaix.POLYGON_STROKE_COLOR;
                                            break;
                                        case 406:
                                            aaixVar = defpackage.aaix.POLYGON_FILL_COLOR;
                                            break;
                                        case 407:
                                            aaixVar = defpackage.aaix.POLYGON_Z_INDEX;
                                            break;
                                        case 408:
                                            aaixVar = defpackage.aaix.POLYGON_VISIBILITY;
                                            break;
                                        case 409:
                                            aaixVar = defpackage.aaix.POLYGON_GEODESIC;
                                            break;
                                        case 410:
                                            aaixVar = defpackage.aaix.POLYGON_CLICK_WITH_LISTENER;
                                            break;
                                        case 411:
                                            aaixVar = defpackage.aaix.POLYGON_CLICK_WITHOUT_LISTENER;
                                            break;
                                        case 412:
                                            aaixVar = defpackage.aaix.POLYGON_CLICKABILITY;
                                            break;
                                        case 413:
                                            aaixVar = defpackage.aaix.POLYGON_STROKE_JOINT_TYPE;
                                            break;
                                        case 414:
                                            aaixVar = defpackage.aaix.POLYGON_STROKE_PATTERN;
                                            break;
                                        case 415:
                                            aaixVar = defpackage.aaix.POLYGON_SET_TAG;
                                            break;
                                        default:
                                            switch (i) {
                                                case 500:
                                                    aaixVar = defpackage.aaix.MAP_ADD_CIRCLE;
                                                    break;
                                                case 501:
                                                    aaixVar = defpackage.aaix.CIRCLE_REMOVE;
                                                    break;
                                                case 502:
                                                    aaixVar = defpackage.aaix.CIRCLE_SET_CENTER;
                                                    break;
                                                case 503:
                                                    aaixVar = defpackage.aaix.CIRCLE_SET_RADIUS;
                                                    break;
                                                case 504:
                                                    aaixVar = defpackage.aaix.CIRCLE_WIDTH;
                                                    break;
                                                case 505:
                                                    aaixVar = defpackage.aaix.CIRCLE_STROKE_COLOR;
                                                    break;
                                                case 506:
                                                    aaixVar = defpackage.aaix.CIRCLE_FILL_COLOR;
                                                    break;
                                                case 507:
                                                    aaixVar = defpackage.aaix.CIRCLE_Z_INDEX;
                                                    break;
                                                case 508:
                                                    aaixVar = defpackage.aaix.CIRCLE_VISIBILITY;
                                                    break;
                                                case 509:
                                                    aaixVar = defpackage.aaix.CIRCLE_CLICK_WITH_LISTENER;
                                                    break;
                                                case 510:
                                                    aaixVar = defpackage.aaix.CIRCLE_CLICK_WITHOUT_LISTENER;
                                                    break;
                                                case 511:
                                                    aaixVar = defpackage.aaix.CIRCLE_CLICKABILITY;
                                                    break;
                                                case defpackage.sp.AUDIO_CONTENT_BUFFER_SIZE /* 512 */:
                                                    aaixVar = defpackage.aaix.CIRCLE_STROKE_PATTERN;
                                                    break;
                                                case 513:
                                                    aaixVar = defpackage.aaix.CIRCLE_SET_TAG;
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 600:
                                                            aaixVar = defpackage.aaix.MAP_ADD_GROUND_OVERLAY;
                                                            break;
                                                        case 601:
                                                            aaixVar = defpackage.aaix.GROUND_OVERLAY_REMOVE;
                                                            break;
                                                        case 602:
                                                            aaixVar = defpackage.aaix.GROUND_OVERLAY_BEARING;
                                                            break;
                                                        case 603:
                                                            aaixVar = defpackage.aaix.GROUND_OVERLAY_SET_DIMENSIONS;
                                                            break;
                                                        case 604:
                                                            aaixVar = defpackage.aaix.GROUND_OVERLAY_SET_LOCATION;
                                                            break;
                                                        case 605:
                                                            aaixVar = defpackage.aaix.GROUND_OVERLAY_Z_INDEX;
                                                            break;
                                                        case 606:
                                                            aaixVar = defpackage.aaix.GROUND_OVERLAY_VISIBILITY;
                                                            break;
                                                        case 607:
                                                            aaixVar = defpackage.aaix.GROUND_OVERLAY_TRANSPARENCY;
                                                            break;
                                                        case 608:
                                                            aaixVar = defpackage.aaix.GROUND_OVERLAY_SET_IMAGE;
                                                            break;
                                                        case 609:
                                                            aaixVar = defpackage.aaix.GROUND_OVERLAY_CLICK_WITH_LISTENER;
                                                            break;
                                                        case 610:
                                                            aaixVar = defpackage.aaix.GROUND_OVERLAY_CLICK_WITHOUT_LISTENER;
                                                            break;
                                                        case 611:
                                                            aaixVar = defpackage.aaix.GROUND_OVERLAY_CLICKABILITY;
                                                            break;
                                                        case 612:
                                                            aaixVar = defpackage.aaix.GROUND_OVERLAY_SET_TAG;
                                                            break;
                                                        default:
                                                            switch (i) {
                                                                case 700:
                                                                    aaixVar = defpackage.aaix.MAP_ADD_TILE_OVERLAY;
                                                                    break;
                                                                case 701:
                                                                    aaixVar = defpackage.aaix.TILE_OVERLAY_CLEAR_CACHE;
                                                                    break;
                                                                case 702:
                                                                    aaixVar = defpackage.aaix.TILE_OVERLAY_REMOVE;
                                                                    break;
                                                                case 703:
                                                                    aaixVar = defpackage.aaix.TILE_OVERLAY_Z_INDEX;
                                                                    break;
                                                                case 704:
                                                                    aaixVar = defpackage.aaix.TILE_OVERLAY_VISIBILITY;
                                                                    break;
                                                                case 705:
                                                                    aaixVar = defpackage.aaix.TILE_OVERLAY_FADE;
                                                                    break;
                                                                case 706:
                                                                    aaixVar = defpackage.aaix.TILE_OVERLAY_TRANSPARENCY;
                                                                    break;
                                                                default:
                                                                    switch (i) {
                                                                        case 800:
                                                                            aaixVar = defpackage.aaix.MAP_ADD_MAPS_ENGINE_OVERLAY;
                                                                            break;
                                                                        case 801:
                                                                            aaixVar = defpackage.aaix.MAPS_ENGINE_OVERLAY_REMOVE;
                                                                            break;
                                                                        case 802:
                                                                            aaixVar = defpackage.aaix.MAPS_ENGINE_OVERLAY_Z_INDEX;
                                                                            break;
                                                                        case 803:
                                                                            aaixVar = defpackage.aaix.MAPS_ENGINE_OVERLAY_VISIBILITY;
                                                                            break;
                                                                        case 804:
                                                                            aaixVar = defpackage.aaix.MAPS_ENGINE_OVERLAY_DEFAULT_UI;
                                                                            break;
                                                                        case 805:
                                                                            aaixVar = defpackage.aaix.MAPS_ENGINE_OVERLAY_CLICK_LISTENER;
                                                                            break;
                                                                        default:
                                                                            switch (i) {
                                                                                case 900:
                                                                                    aaixVar = defpackage.aaix.MAP_ANIMATE_CAMERA;
                                                                                    break;
                                                                                case 901:
                                                                                    aaixVar = defpackage.aaix.MAP_ANIMATE_CAMERA_WITH_CALLBACK;
                                                                                    break;
                                                                                case 902:
                                                                                    aaixVar = defpackage.aaix.MAP_ANIMATE_CAMERA_WITH_CALLBACK_AND_CUSTOM_DURATION;
                                                                                    break;
                                                                                case 903:
                                                                                    aaixVar = defpackage.aaix.MAP_MOVE_CAMERA;
                                                                                    break;
                                                                                case 904:
                                                                                    aaixVar = defpackage.aaix.MAP_STOP_ANIMATION;
                                                                                    break;
                                                                                default:
                                                                                    switch (i) {
                                                                                        case 1000:
                                                                                            aaixVar = defpackage.aaix.CAMERA_UPDATE_ZOOM_IN;
                                                                                            break;
                                                                                        case 1001:
                                                                                            aaixVar = defpackage.aaix.CAMERA_UPDATE_ZOOM_OUT;
                                                                                            break;
                                                                                        case 1002:
                                                                                            aaixVar = defpackage.aaix.CAMERA_UPDATE_SCROLL_BY;
                                                                                            break;
                                                                                        case 1003:
                                                                                            aaixVar = defpackage.aaix.CAMERA_UPDATE_ZOOM_TO;
                                                                                            break;
                                                                                        case 1004:
                                                                                            aaixVar = defpackage.aaix.CAMERA_UPDATE_ZOOM_BY;
                                                                                            break;
                                                                                        case 1005:
                                                                                            aaixVar = defpackage.aaix.CAMERA_UPDATE_ZOOM_BY_FIXING;
                                                                                            break;
                                                                                        case 1006:
                                                                                            aaixVar = defpackage.aaix.CAMERA_UPDATE_NEW_CAMERA_POSITION;
                                                                                            break;
                                                                                        case 1007:
                                                                                            aaixVar = defpackage.aaix.CAMERA_UPDATE_NEW_LATLNG;
                                                                                            break;
                                                                                        case 1008:
                                                                                            aaixVar = defpackage.aaix.CAMERA_UPDATE_NEW_LATLNG_ZOOM;
                                                                                            break;
                                                                                        case 1009:
                                                                                            aaixVar = defpackage.aaix.CAMERA_UPDATE_NEW_LATLNG_BOUNDS;
                                                                                            break;
                                                                                        case 1010:
                                                                                            aaixVar = defpackage.aaix.CAMERA_UPDATE_NEW_LATLNG_BOUNDS_WITH_DIMENSIONS;
                                                                                            break;
                                                                                        case 1011:
                                                                                            aaixVar = defpackage.aaix.CAMERA_ZOOM_DEVELOPER_MINIMUM;
                                                                                            break;
                                                                                        case 1012:
                                                                                            aaixVar = defpackage.aaix.CAMERA_ZOOM_DEVELOPER_MAXIMUM;
                                                                                            break;
                                                                                        case 1013:
                                                                                            aaixVar = defpackage.aaix.CAMERA_ZOOM_DEVELOPER_RESET;
                                                                                            break;
                                                                                        case 1014:
                                                                                            aaixVar = defpackage.aaix.CAMERA_LAT_LNG_DEVELOPER_CLAMP;
                                                                                            break;
                                                                                        default:
                                                                                            aaixVar = null;
                                                                                            break;
                                                                                    }
                                                                                    break;
                                                                            }
                                                                            break;
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            aaixVar = defpackage.aaix.UNKNOWN_EVENT;
        }
        return aaixVar != null;
    }
}
