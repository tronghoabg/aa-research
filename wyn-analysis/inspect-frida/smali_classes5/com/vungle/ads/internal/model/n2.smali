.class public final enum Lcom/vungle/ads/internal/model/n2;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final b:Ljava/util/LinkedHashMap;

.field public static final synthetic c:[Lcom/vungle/ads/internal/model/n2;


# instance fields
.field public final a:I


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lcom/vungle/ads/internal/model/n2;

    .line 2
    .line 3
    const-string v1, "ALLOW_ID"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lcom/vungle/ads/internal/model/n2;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lcom/vungle/ads/internal/model/n2;

    .line 10
    .line 11
    const-string v3, "DISABLE_ID"

    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    invoke-direct {v1, v3, v4, v4}, Lcom/vungle/ads/internal/model/n2;-><init>(Ljava/lang/String;II)V

    .line 15
    .line 16
    .line 17
    new-instance v3, Lcom/vungle/ads/internal/model/n2;

    .line 18
    .line 19
    const-string v5, "LEGACY"

    .line 20
    .line 21
    const/4 v6, 0x2

    .line 22
    invoke-direct {v3, v5, v6, v6}, Lcom/vungle/ads/internal/model/n2;-><init>(Ljava/lang/String;II)V

    .line 23
    .line 24
    .line 25
    const/4 v5, 0x3

    .line 26
    new-array v5, v5, [Lcom/vungle/ads/internal/model/n2;

    .line 27
    .line 28
    aput-object v0, v5, v2

    .line 29
    .line 30
    aput-object v1, v5, v4

    .line 31
    .line 32
    aput-object v3, v5, v6

    .line 33
    .line 34
    sput-object v5, Lcom/vungle/ads/internal/model/n2;->c:[Lcom/vungle/ads/internal/model/n2;

    .line 35
    .line 36
    invoke-static {}, Lcom/vungle/ads/internal/model/n2;->values()[Lcom/vungle/ads/internal/model/n2;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    array-length v1, v0

    .line 41
    invoke-static {v1}, Lff/B;->D(I)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    const/16 v3, 0x10

    .line 46
    .line 47
    if-ge v1, v3, :cond_0

    .line 48
    .line 49
    move v1, v3

    .line 50
    :cond_0
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 51
    .line 52
    invoke-direct {v3, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 53
    .line 54
    .line 55
    array-length v1, v0

    .line 56
    :goto_0
    if-ge v2, v1, :cond_1

    .line 57
    .line 58
    aget-object v5, v0, v2

    .line 59
    .line 60
    iget v6, v5, Lcom/vungle/ads/internal/model/n2;->a:I

    .line 61
    .line 62
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    invoke-interface {v3, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    add-int/2addr v2, v4

    .line 70
    goto :goto_0

    .line 71
    :cond_1
    sput-object v3, Lcom/vungle/ads/internal/model/n2;->b:Ljava/util/LinkedHashMap;

    .line 72
    .line 73
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/vungle/ads/internal/model/n2;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/vungle/ads/internal/model/n2;
    .locals 1

    const-class v0, Lcom/vungle/ads/internal/model/n2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/vungle/ads/internal/model/n2;

    return-object p0
.end method

.method public static values()[Lcom/vungle/ads/internal/model/n2;
    .locals 1

    sget-object v0, Lcom/vungle/ads/internal/model/n2;->c:[Lcom/vungle/ads/internal/model/n2;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/vungle/ads/internal/model/n2;

    return-object v0
.end method
