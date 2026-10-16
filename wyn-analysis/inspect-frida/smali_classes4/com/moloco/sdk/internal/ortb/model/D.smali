.class public final Lcom/moloco/sdk/internal/ortb/model/D;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LSf/e;
.end annotation


# static fields
.field public static final Companion:Lcom/moloco/sdk/internal/ortb/model/k$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final i:[Lkotlinx/serialization/KSerializer;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:I

.field public final d:Ljava/lang/Integer;

.field public final e:Lcom/moloco/sdk/internal/ortb/model/X;

.field public final f:Lcom/moloco/sdk/internal/ortb/model/k;

.field public final g:J

.field public final h:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    new-instance v1, Lcom/moloco/sdk/internal/ortb/model/k$b;

    .line 3
    .line 4
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    sput-object v1, Lcom/moloco/sdk/internal/ortb/model/D;->Companion:Lcom/moloco/sdk/internal/ortb/model/k$b;

    .line 8
    .line 9
    sget-object v1, Lcom/moloco/sdk/internal/ortb/model/X;->Companion:Lcom/moloco/sdk/internal/ortb/model/u$a;

    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/moloco/sdk/internal/ortb/model/u$a;->serializer()Lkotlinx/serialization/KSerializer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/k;->Companion:Lcom/moloco/sdk/internal/ortb/model/F$a;

    .line 16
    .line 17
    invoke-virtual {v2}, Lcom/moloco/sdk/internal/ortb/model/F$a;->serializer()Lkotlinx/serialization/KSerializer;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const/16 v3, 0x8

    .line 22
    .line 23
    new-array v3, v3, [Lkotlinx/serialization/KSerializer;

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    aput-object v0, v3, v4

    .line 27
    .line 28
    const/4 v4, 0x1

    .line 29
    aput-object v0, v3, v4

    .line 30
    .line 31
    const/4 v4, 0x2

    .line 32
    aput-object v0, v3, v4

    .line 33
    .line 34
    const/4 v4, 0x3

    .line 35
    aput-object v0, v3, v4

    .line 36
    .line 37
    const/4 v4, 0x4

    .line 38
    aput-object v1, v3, v4

    .line 39
    .line 40
    const/4 v1, 0x5

    .line 41
    aput-object v2, v3, v1

    .line 42
    .line 43
    const/4 v1, 0x6

    .line 44
    aput-object v0, v3, v1

    .line 45
    .line 46
    const/4 v1, 0x7

    .line 47
    aput-object v0, v3, v1

    .line 48
    .line 49
    sput-object v3, Lcom/moloco/sdk/internal/ortb/model/D;->i:[Lkotlinx/serialization/KSerializer;

    .line 50
    .line 51
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ZLef/u;Ljava/lang/Integer;Lcom/moloco/sdk/internal/ortb/model/X;Lcom/moloco/sdk/internal/ortb/model/k;Le0/q;Le0/q;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    and-int/lit8 v0, p1, 0x1

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-object v1, p0, Lcom/moloco/sdk/internal/ortb/model/D;->a:Ljava/lang/String;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iput-object p2, p0, Lcom/moloco/sdk/internal/ortb/model/D;->a:Ljava/lang/String;

    .line 13
    .line 14
    :goto_0
    and-int/lit8 p2, p1, 0x2

    .line 15
    .line 16
    if-nez p2, :cond_1

    .line 17
    .line 18
    const/4 p2, 0x1

    .line 19
    iput-boolean p2, p0, Lcom/moloco/sdk/internal/ortb/model/D;->b:Z

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    iput-boolean p3, p0, Lcom/moloco/sdk/internal/ortb/model/D;->b:Z

    .line 23
    .line 24
    :goto_1
    and-int/lit8 p2, p1, 0x4

    .line 25
    .line 26
    if-nez p2, :cond_2

    .line 27
    .line 28
    const/16 p2, 0x1e

    .line 29
    .line 30
    :goto_2
    iput p2, p0, Lcom/moloco/sdk/internal/ortb/model/D;->c:I

    .line 31
    .line 32
    goto :goto_3

    .line 33
    :cond_2
    iget p2, p4, Lef/u;->a:I

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :goto_3
    and-int/lit8 p2, p1, 0x8

    .line 37
    .line 38
    if-nez p2, :cond_3

    .line 39
    .line 40
    iput-object v1, p0, Lcom/moloco/sdk/internal/ortb/model/D;->d:Ljava/lang/Integer;

    .line 41
    .line 42
    goto :goto_4

    .line 43
    :cond_3
    iput-object p5, p0, Lcom/moloco/sdk/internal/ortb/model/D;->d:Ljava/lang/Integer;

    .line 44
    .line 45
    :goto_4
    and-int/lit8 p2, p1, 0x10

    .line 46
    .line 47
    if-nez p2, :cond_4

    .line 48
    .line 49
    sget-object p2, Lcom/moloco/sdk/internal/ortb/model/X;->f:Lcom/moloco/sdk/internal/ortb/model/X;

    .line 50
    .line 51
    iput-object p2, p0, Lcom/moloco/sdk/internal/ortb/model/D;->e:Lcom/moloco/sdk/internal/ortb/model/X;

    .line 52
    .line 53
    goto :goto_5

    .line 54
    :cond_4
    iput-object p6, p0, Lcom/moloco/sdk/internal/ortb/model/D;->e:Lcom/moloco/sdk/internal/ortb/model/X;

    .line 55
    .line 56
    :goto_5
    and-int/lit8 p2, p1, 0x20

    .line 57
    .line 58
    if-nez p2, :cond_5

    .line 59
    .line 60
    sget-object p2, Lcom/moloco/sdk/internal/ortb/model/k;->b:Lcom/moloco/sdk/internal/ortb/model/k;

    .line 61
    .line 62
    iput-object p2, p0, Lcom/moloco/sdk/internal/ortb/model/D;->f:Lcom/moloco/sdk/internal/ortb/model/k;

    .line 63
    .line 64
    goto :goto_6

    .line 65
    :cond_5
    iput-object p7, p0, Lcom/moloco/sdk/internal/ortb/model/D;->f:Lcom/moloco/sdk/internal/ortb/model/k;

    .line 66
    .line 67
    :goto_6
    and-int/lit8 p2, p1, 0x40

    .line 68
    .line 69
    if-nez p2, :cond_6

    .line 70
    .line 71
    const-string p2, "#FF4285f4"

    .line 72
    .line 73
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    invoke-static {p2}, Le0/z;->b(I)J

    .line 78
    .line 79
    .line 80
    move-result-wide p2

    .line 81
    :goto_7
    iput-wide p2, p0, Lcom/moloco/sdk/internal/ortb/model/D;->g:J

    .line 82
    .line 83
    goto :goto_8

    .line 84
    :cond_6
    iget-wide p2, p8, Le0/q;->a:J

    .line 85
    .line 86
    goto :goto_7

    .line 87
    :goto_8
    and-int/lit16 p1, p1, 0x80

    .line 88
    .line 89
    if-nez p1, :cond_7

    .line 90
    .line 91
    const-string p1, "#FFFFFFFF"

    .line 92
    .line 93
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    invoke-static {p1}, Le0/z;->b(I)J

    .line 98
    .line 99
    .line 100
    move-result-wide p1

    .line 101
    iput-wide p1, p0, Lcom/moloco/sdk/internal/ortb/model/D;->h:J

    .line 102
    .line 103
    return-void

    .line 104
    :cond_7
    iget-wide p1, p9, Le0/q;->a:J

    .line 105
    .line 106
    iput-wide p1, p0, Lcom/moloco/sdk/internal/ortb/model/D;->h:J

    .line 107
    .line 108
    return-void
.end method
