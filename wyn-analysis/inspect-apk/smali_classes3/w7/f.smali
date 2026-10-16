.class public final enum Lw7/f;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lw7/f;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum b:Lw7/f;

.field public static final synthetic c:[Lw7/f;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lw7/f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "UNKNOWN"

    .line 5
    .line 6
    invoke-direct {v0, v2, v1, v2}, Lw7/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lw7/f;->b:Lw7/f;

    .line 10
    .line 11
    new-instance v2, Lw7/f;

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    const-string v4, "U2F_V1"

    .line 15
    .line 16
    const-string v5, "V1"

    .line 17
    .line 18
    invoke-direct {v2, v5, v3, v4}, Lw7/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v4, Lw7/f;

    .line 22
    .line 23
    const/4 v5, 0x2

    .line 24
    const-string v6, "U2F_V2"

    .line 25
    .line 26
    const-string v7, "V2"

    .line 27
    .line 28
    invoke-direct {v4, v7, v5, v6}, Lw7/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 v6, 0x3

    .line 32
    new-array v7, v6, [Lw7/f;

    .line 33
    .line 34
    aput-object v0, v7, v1

    .line 35
    .line 36
    aput-object v2, v7, v3

    .line 37
    .line 38
    aput-object v4, v7, v5

    .line 39
    .line 40
    sput-object v7, Lw7/f;->c:[Lw7/f;

    .line 41
    .line 42
    new-instance v0, Lw7/i;

    .line 43
    .line 44
    invoke-direct {v0, v6}, Lw7/i;-><init>(I)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lw7/f;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 48
    .line 49
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lw7/f;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static c(Ljava/lang/String;)Lw7/f;
    .locals 5

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lw7/f;->b:Lw7/f;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-static {}, Lw7/f;->values()[Lw7/f;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    array-length v1, v0

    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v1, :cond_2

    .line 13
    .line 14
    aget-object v3, v0, v2

    .line 15
    .line 16
    iget-object v4, v3, Lw7/f;->a:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    return-object v3

    .line 25
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    new-instance v0, Lw7/e;

    .line 29
    .line 30
    const-string v1, "Protocol version "

    .line 31
    .line 32
    const-string v2, " not supported"

    .line 33
    .line 34
    invoke-static {v1, p0, v2}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lw7/f;
    .locals 1

    .line 1
    const-class v0, Lw7/f;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lw7/f;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lw7/f;
    .locals 1

    .line 1
    sget-object v0, Lw7/f;->c:[Lw7/f;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lw7/f;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lw7/f;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lw7/f;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    iget-object p2, p0, Lw7/f;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
