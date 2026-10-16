.class public final enum Lv7/s;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lv7/a;


# static fields
.field public static final synthetic b:[Lv7/s;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lv7/s;

    .line 2
    .line 3
    const/16 v1, -0x104

    .line 4
    .line 5
    const-string v2, "ED256"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v3, v1}, Lv7/s;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lv7/s;

    .line 12
    .line 13
    const/16 v2, -0x105

    .line 14
    .line 15
    const-string v4, "ED512"

    .line 16
    .line 17
    const/4 v5, 0x1

    .line 18
    invoke-direct {v1, v4, v5, v2}, Lv7/s;-><init>(Ljava/lang/String;II)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Lv7/s;

    .line 22
    .line 23
    const/4 v4, -0x8

    .line 24
    const-string v6, "ED25519"

    .line 25
    .line 26
    const/4 v7, 0x2

    .line 27
    invoke-direct {v2, v6, v7, v4}, Lv7/s;-><init>(Ljava/lang/String;II)V

    .line 28
    .line 29
    .line 30
    new-instance v4, Lv7/s;

    .line 31
    .line 32
    const/4 v6, -0x7

    .line 33
    const-string v8, "ES256"

    .line 34
    .line 35
    const/4 v9, 0x3

    .line 36
    invoke-direct {v4, v8, v9, v6}, Lv7/s;-><init>(Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    new-instance v6, Lv7/s;

    .line 40
    .line 41
    const/16 v8, -0x19

    .line 42
    .line 43
    const-string v10, "ECDH_HKDF_256"

    .line 44
    .line 45
    const/4 v11, 0x4

    .line 46
    invoke-direct {v6, v10, v11, v8}, Lv7/s;-><init>(Ljava/lang/String;II)V

    .line 47
    .line 48
    .line 49
    new-instance v8, Lv7/s;

    .line 50
    .line 51
    const/16 v10, -0x23

    .line 52
    .line 53
    const-string v12, "ES384"

    .line 54
    .line 55
    const/4 v13, 0x5

    .line 56
    invoke-direct {v8, v12, v13, v10}, Lv7/s;-><init>(Ljava/lang/String;II)V

    .line 57
    .line 58
    .line 59
    new-instance v10, Lv7/s;

    .line 60
    .line 61
    const/16 v12, -0x24

    .line 62
    .line 63
    const-string v14, "ES512"

    .line 64
    .line 65
    const/4 v15, 0x6

    .line 66
    invoke-direct {v10, v14, v15, v12}, Lv7/s;-><init>(Ljava/lang/String;II)V

    .line 67
    .line 68
    .line 69
    const/4 v12, 0x7

    .line 70
    new-array v12, v12, [Lv7/s;

    .line 71
    .line 72
    aput-object v0, v12, v3

    .line 73
    .line 74
    aput-object v1, v12, v5

    .line 75
    .line 76
    aput-object v2, v12, v7

    .line 77
    .line 78
    aput-object v4, v12, v9

    .line 79
    .line 80
    aput-object v6, v12, v11

    .line 81
    .line 82
    aput-object v8, v12, v13

    .line 83
    .line 84
    aput-object v10, v12, v15

    .line 85
    .line 86
    sput-object v12, Lv7/s;->b:[Lv7/s;

    .line 87
    .line 88
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lv7/s;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lv7/s;
    .locals 1

    .line 1
    const-class v0, Lv7/s;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lv7/s;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lv7/s;
    .locals 1

    .line 1
    sget-object v0, Lv7/s;->b:[Lv7/s;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lv7/s;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lv7/s;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lv7/s;->a:I

    .line 2
    .line 3
    return v0
.end method
