.class public final enum Lorg/apache/tika/config/TikaConfigSerializer$Mode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/tika/config/TikaConfigSerializer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Mode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/apache/tika/config/TikaConfigSerializer$Mode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/apache/tika/config/TikaConfigSerializer$Mode;

.field public static final enum CURRENT:Lorg/apache/tika/config/TikaConfigSerializer$Mode;

.field public static final enum MINIMAL:Lorg/apache/tika/config/TikaConfigSerializer$Mode;

.field public static final enum STATIC:Lorg/apache/tika/config/TikaConfigSerializer$Mode;

.field public static final enum STATIC_FULL:Lorg/apache/tika/config/TikaConfigSerializer$Mode;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lorg/apache/tika/config/TikaConfigSerializer$Mode;

    .line 2
    .line 3
    const-string v1, "MINIMAL"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lorg/apache/tika/config/TikaConfigSerializer$Mode;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lorg/apache/tika/config/TikaConfigSerializer$Mode;->MINIMAL:Lorg/apache/tika/config/TikaConfigSerializer$Mode;

    .line 10
    .line 11
    new-instance v1, Lorg/apache/tika/config/TikaConfigSerializer$Mode;

    .line 12
    .line 13
    const-string v3, "CURRENT"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lorg/apache/tika/config/TikaConfigSerializer$Mode;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lorg/apache/tika/config/TikaConfigSerializer$Mode;->CURRENT:Lorg/apache/tika/config/TikaConfigSerializer$Mode;

    .line 20
    .line 21
    new-instance v3, Lorg/apache/tika/config/TikaConfigSerializer$Mode;

    .line 22
    .line 23
    const-string v5, "STATIC"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6}, Lorg/apache/tika/config/TikaConfigSerializer$Mode;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lorg/apache/tika/config/TikaConfigSerializer$Mode;->STATIC:Lorg/apache/tika/config/TikaConfigSerializer$Mode;

    .line 30
    .line 31
    new-instance v5, Lorg/apache/tika/config/TikaConfigSerializer$Mode;

    .line 32
    .line 33
    const-string v7, "STATIC_FULL"

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    invoke-direct {v5, v7, v8}, Lorg/apache/tika/config/TikaConfigSerializer$Mode;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v5, Lorg/apache/tika/config/TikaConfigSerializer$Mode;->STATIC_FULL:Lorg/apache/tika/config/TikaConfigSerializer$Mode;

    .line 40
    .line 41
    const/4 v7, 0x4

    .line 42
    new-array v7, v7, [Lorg/apache/tika/config/TikaConfigSerializer$Mode;

    .line 43
    .line 44
    aput-object v0, v7, v2

    .line 45
    .line 46
    aput-object v1, v7, v4

    .line 47
    .line 48
    aput-object v3, v7, v6

    .line 49
    .line 50
    aput-object v5, v7, v8

    .line 51
    .line 52
    sput-object v7, Lorg/apache/tika/config/TikaConfigSerializer$Mode;->$VALUES:[Lorg/apache/tika/config/TikaConfigSerializer$Mode;

    .line 53
    .line 54
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/apache/tika/config/TikaConfigSerializer$Mode;
    .locals 1

    .line 1
    const-class v0, Lorg/apache/tika/config/TikaConfigSerializer$Mode;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/apache/tika/config/TikaConfigSerializer$Mode;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lorg/apache/tika/config/TikaConfigSerializer$Mode;
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/tika/config/TikaConfigSerializer$Mode;->$VALUES:[Lorg/apache/tika/config/TikaConfigSerializer$Mode;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lorg/apache/tika/config/TikaConfigSerializer$Mode;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lorg/apache/tika/config/TikaConfigSerializer$Mode;

    .line 8
    .line 9
    return-object v0
.end method
