package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum zrs implements defpackage.abpb {
    COUNTERS_METRIC_NONE(0),
    COUNTERS_METRIC_RENDERING_FPS(1),
    COUNTERS_METRIC_TILE_PREP_TIME(2),
    COUNTERS_METRIC_TILE_PREP_BACKGROUND_WORK_TIME(76),
    COUNTERS_METRIC_RENDERER_LOW_MEMORY_EVENTS(62),
    DISK_CACHE_RESOURCE_READ_ERRORS(3),
    DISK_CACHE_RESOURCE_WRITE_ERRORS(4),
    DISK_CACHE_RESOURCE_CHECKSUM_MISMATCH(5),
    DISK_CACHE_MIN_PRIORITY_QUERY_TIME(6),
    DISK_CACHE_RESOURCE_TABLE_TRIM_TIME(7),
    DISK_CACHE_TILE_TABLE_TRIM_TIME(8),
    TILE_STORE_TILE_READ_ERRORS(9),
    TILE_STORE_TILE_WRITE_ERRORS(10),
    TILES_CORRUPT_FROM_CHECKSUM_MISMATCH(11),
    TILES_EXPIRED_FROM_DISK_CACHE(12),
    FRAME_TIME(13),
    GPU_HANG_DURATION(14),
    GPU_BUFFER_COUNT(27),
    DISK_CACHE_SIZE_ON_STARTUP(28),
    DISK_CACHE_SIZE_ON_COMPACTION_CHECK(29),
    DISK_CACHE_MAX_DATABASE_SIZE(30),
    DISK_CACHE_AVAILABLE_SPACE_RESTRICTED(31),
    DISK_ONLINE_CACHE_CREATION_RESULT(32),
    DISK_ONLINE_CACHE_STARTUP_TIME(33),
    MAPCORE_REQUESTS_TO_OVERLAY_LATENCY_MS(36),
    MAPCORE_REQUESTS_TO_TILE_FETCHER_LATENCY_MS(37),
    MAPCORE_REQUESTS_TO_ONLINE_DISK_CACHE_LATENCY_MS(38),
    MAPCORE_REQUESTS_TO_OFFLINE_DISK_CACHE_LATENCY_MS(39),
    MAPCORE_REQUESTS_TO_NETWORK_LATENCY_MS(40),
    MAPCORE_TILE_UPDATE_REASON_OFFROAD(41),
    MAPCORE_TILE_UPDATE_REASON_EXPIRED(42),
    MAPCORE_TILE_UPDATE_REASON_WRONG_MAJOR_EPOCH(43),
    MAPCORE_TILE_UPDATE_REASON_MISMATCHED_EXPERIMENT_IDS(44),
    MAPCORE_TILE_UPDATE_REASON_STALE(45),
    MAPCORE_TILE_UPDATE_REASON_WRONG_LEGAL_COUNTRY(46),
    MAPCORE_TILE_UPDATE_REASON_WRONG_LOCALE(47),
    MAPCORE_TILE_UPDATE_REASON_NO_UPDATE_NEEDED(48),
    MAPCORE_TILE_UPDATE_REASON_MISMATCHED_ACCOUNT_ID(74),
    MAPCORE_TILE_UPDATE_REASON_MISMATCHED_STYLE_CONSISTENCY_KEY(75),
    MAPCORE_EPOCH_DETECTION_DISABLED_DUE_TO_EXPERIMENT_ID_MISMATCH(49),
    MAPCORE_EPOCH_DETECTION_DISABLED_DUE_TO_LEGAL_COUNTRY_MISMATCH(50),
    MAPCORE_EPOCH_DETECTION_DISABLED_DUE_TO_OFFROAD_TILE(51),
    MAPCORE_EPOCH_DETECTION_DISABLED_DUE_TO_CONSISTENCY_KEY_IN_EPOCH_RESOURCES_IDENTIFIER(70),
    DISK_CACHE_WRITE_TIME_TILE_MS(52),
    COUNTERS_METRIC_TILE_UNPACK_TIME(53),
    MAPCORE_TILES_FETCHED_FROM_PAINT(54),
    MAPCORE_TILES_FETCHED_FROM_PAINT_SIZE(55),
    MAPCORE_TILES_FETCHED_FROM_PAINT_UNCHANGED(56),
    MAPCORE_TILES_FETCHED_FROM_PAINT_UNCHANGED_SIZE(57),
    MAPCORE_TILES_REQUESTED_TO_PAINT_SIZE(58),
    MAPCORE_RESOURCE_NETWORK_REQUESTS(59),
    MAPCORE_PAINT_PARAMETERS_REQUESTS(60),
    MAPCORE_CURRENT_EPOCH_CHANGED(61),
    MAPCORE_NETWORK_REQUEST_CANCELLED(63),
    PAINT_REQUEST_NOT_BATCHED_SOURCE(64),
    MAPCORE_PAINT_PARAMETERS_REQUESTS_FOR_MISSING_EPOCH_RESOURCES(65),
    MAPCORE_PAINT_PARAMETERS_REQUESTS_FOR_MISSING_VALID_EPOCH(66),
    MAPCORE_TILE_FETCHER_QUEUE_TIME_MS(67),
    MAPCORE_PAINT_PARAMETERS_REQUEST_RETRIES(68),
    MAPCORE_PAINT_PARAMETERS_RESPONSE_TIME_MS(71),
    RENDERED_FRAMES(72),
    SKIP_COMPENSATED_RENDERED_FRAMES(82),
    MAPCORE_TILES_FETCHED_FROM_PAINT_UNCHANGED_WITHOUT_USABLE_CACHED_TILE(73),
    COUNTERS_METRIC_RENDERER_SHARED_BUFFER_FLUSHES(77),
    COUNTERS_METRIC_RENDERER_SHARED_TEXTURE_ALLOCATIONS(78),
    COUNTERS_METRIC_RENDERER_SHARED_BUFFER_ENTRY_COUNT(79),
    MAPCORE_VIEWPORT_QUALITY_BASE_OVERLAY_UNCOVERED_PCT(80),
    MAPCORE_PAINT_REQUEST_BATCH_SIZE(81),
    COUNTERS_METRIC_RENDERER_UNPACKED_NODE_PATH_STYLES(83),
    COUNTERS_METRIC_RENDERER_UNPACKED_STYLE_ID_STYLES(84),
    COUNTERS_METRIC_RENDERER_FAILED_TO_RESOLVE_STYLES(85);

    private final int au;

    zrs(int i) {
        this.au = i;
    }

    public static defpackage.zrs b(int i) {
        switch (i) {
            case 0:
                return COUNTERS_METRIC_NONE;
            case 1:
                return COUNTERS_METRIC_RENDERING_FPS;
            case 2:
                return COUNTERS_METRIC_TILE_PREP_TIME;
            case 3:
                return DISK_CACHE_RESOURCE_READ_ERRORS;
            case 4:
                return DISK_CACHE_RESOURCE_WRITE_ERRORS;
            case 5:
                return DISK_CACHE_RESOURCE_CHECKSUM_MISMATCH;
            case 6:
                return DISK_CACHE_MIN_PRIORITY_QUERY_TIME;
            case 7:
                return DISK_CACHE_RESOURCE_TABLE_TRIM_TIME;
            case 8:
                return DISK_CACHE_TILE_TABLE_TRIM_TIME;
            case 9:
                return TILE_STORE_TILE_READ_ERRORS;
            case 10:
                return TILE_STORE_TILE_WRITE_ERRORS;
            case 11:
                return TILES_CORRUPT_FROM_CHECKSUM_MISMATCH;
            case 12:
                return TILES_EXPIRED_FROM_DISK_CACHE;
            case 13:
                return FRAME_TIME;
            case 14:
                return GPU_HANG_DURATION;
            default:
                switch (i) {
                    case 27:
                        return GPU_BUFFER_COUNT;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                        return DISK_CACHE_SIZE_ON_STARTUP;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                        return DISK_CACHE_SIZE_ON_COMPACTION_CHECK;
                    case 30:
                        return DISK_CACHE_MAX_DATABASE_SIZE;
                    case 31:
                        return DISK_CACHE_AVAILABLE_SPACE_RESTRICTED;
                    case 32:
                        return DISK_ONLINE_CACHE_CREATION_RESULT;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                        return DISK_ONLINE_CACHE_STARTUP_TIME;
                    default:
                        switch (i) {
                            case androidx.car.app.navigation.model.Maneuver.TYPE_STRAIGHT /* 36 */:
                                return MAPCORE_REQUESTS_TO_OVERLAY_LATENCY_MS;
                            case 37:
                                return MAPCORE_REQUESTS_TO_TILE_FETCHER_LATENCY_MS;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                return MAPCORE_REQUESTS_TO_ONLINE_DISK_CACHE_LATENCY_MS;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                return MAPCORE_REQUESTS_TO_OFFLINE_DISK_CACHE_LATENCY_MS;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                return MAPCORE_REQUESTS_TO_NETWORK_LATENCY_MS;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                                return MAPCORE_TILE_UPDATE_REASON_OFFROAD;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                return MAPCORE_TILE_UPDATE_REASON_EXPIRED;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                                return MAPCORE_TILE_UPDATE_REASON_WRONG_MAJOR_EPOCH;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                return MAPCORE_TILE_UPDATE_REASON_MISMATCHED_EXPERIMENT_IDS;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                return MAPCORE_TILE_UPDATE_REASON_STALE;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                return MAPCORE_TILE_UPDATE_REASON_WRONG_LEGAL_COUNTRY;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                return MAPCORE_TILE_UPDATE_REASON_WRONG_LOCALE;
                            case 48:
                                return MAPCORE_TILE_UPDATE_REASON_NO_UPDATE_NEEDED;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                return MAPCORE_EPOCH_DETECTION_DISABLED_DUE_TO_EXPERIMENT_ID_MISMATCH;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                return MAPCORE_EPOCH_DETECTION_DISABLED_DUE_TO_LEGAL_COUNTRY_MISMATCH;
                            case 51:
                                return MAPCORE_EPOCH_DETECTION_DISABLED_DUE_TO_OFFROAD_TILE;
                            case 52:
                                return DISK_CACHE_WRITE_TIME_TILE_MS;
                            case 53:
                                return COUNTERS_METRIC_TILE_UNPACK_TIME;
                            case 54:
                                return MAPCORE_TILES_FETCHED_FROM_PAINT;
                            case 55:
                                return MAPCORE_TILES_FETCHED_FROM_PAINT_SIZE;
                            case 56:
                                return MAPCORE_TILES_FETCHED_FROM_PAINT_UNCHANGED;
                            case 57:
                                return MAPCORE_TILES_FETCHED_FROM_PAINT_UNCHANGED_SIZE;
                            case 58:
                                return MAPCORE_TILES_REQUESTED_TO_PAINT_SIZE;
                            case 59:
                                return MAPCORE_RESOURCE_NETWORK_REQUESTS;
                            case 60:
                                return MAPCORE_PAINT_PARAMETERS_REQUESTS;
                            case 61:
                                return MAPCORE_CURRENT_EPOCH_CHANGED;
                            case 62:
                                return COUNTERS_METRIC_RENDERER_LOW_MEMORY_EVENTS;
                            case 63:
                                return MAPCORE_NETWORK_REQUEST_CANCELLED;
                            case androidx.car.app.hardware.common.CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                                return PAINT_REQUEST_NOT_BATCHED_SOURCE;
                            case 65:
                                return MAPCORE_PAINT_PARAMETERS_REQUESTS_FOR_MISSING_EPOCH_RESOURCES;
                            case 66:
                                return MAPCORE_PAINT_PARAMETERS_REQUESTS_FOR_MISSING_VALID_EPOCH;
                            case 67:
                                return MAPCORE_TILE_FETCHER_QUEUE_TIME_MS;
                            case 68:
                                return MAPCORE_PAINT_PARAMETERS_REQUEST_RETRIES;
                            default:
                                switch (i) {
                                    case 70:
                                        return MAPCORE_EPOCH_DETECTION_DISABLED_DUE_TO_CONSISTENCY_KEY_IN_EPOCH_RESOURCES_IDENTIFIER;
                                    case 71:
                                        return MAPCORE_PAINT_PARAMETERS_RESPONSE_TIME_MS;
                                    case 72:
                                        return RENDERED_FRAMES;
                                    case 73:
                                        return MAPCORE_TILES_FETCHED_FROM_PAINT_UNCHANGED_WITHOUT_USABLE_CACHED_TILE;
                                    case 74:
                                        return MAPCORE_TILE_UPDATE_REASON_MISMATCHED_ACCOUNT_ID;
                                    case 75:
                                        return MAPCORE_TILE_UPDATE_REASON_MISMATCHED_STYLE_CONSISTENCY_KEY;
                                    case 76:
                                        return COUNTERS_METRIC_TILE_PREP_BACKGROUND_WORK_TIME;
                                    case 77:
                                        return COUNTERS_METRIC_RENDERER_SHARED_BUFFER_FLUSHES;
                                    case 78:
                                        return COUNTERS_METRIC_RENDERER_SHARED_TEXTURE_ALLOCATIONS;
                                    case 79:
                                        return COUNTERS_METRIC_RENDERER_SHARED_BUFFER_ENTRY_COUNT;
                                    case androidx.car.app.hardware.common.CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                                        return MAPCORE_VIEWPORT_QUALITY_BASE_OVERLAY_UNCOVERED_PCT;
                                    case 81:
                                        return MAPCORE_PAINT_REQUEST_BATCH_SIZE;
                                    case 82:
                                        return SKIP_COMPENSATED_RENDERED_FRAMES;
                                    case 83:
                                        return COUNTERS_METRIC_RENDERER_UNPACKED_NODE_PATH_STYLES;
                                    case 84:
                                        return COUNTERS_METRIC_RENDERER_UNPACKED_STYLE_ID_STYLES;
                                    case 85:
                                        return COUNTERS_METRIC_RENDERER_FAILED_TO_RESOLVE_STYLES;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.au;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.au);
    }
}
