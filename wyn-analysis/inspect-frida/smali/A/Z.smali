.class public final LA/Z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA/u;


# instance fields
.field public final a:I

.field public final b:LA/r;


# direct methods
.method public constructor <init>(ILA/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, LA/Z;->a:I

    .line 3
    iput-object p2, p0, LA/Z;->b:LA/r;

    return-void
.end method

.method public constructor <init>(ILA/r;I)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput p1, p0, LA/Z;->a:I

    .line 6
    iput-object p2, p0, LA/Z;->b:LA/r;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, LA/Z;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, LA/Z;

    .line 6
    .line 7
    iget v0, p1, LA/Z;->a:I

    .line 8
    .line 9
    iget v1, p0, LA/Z;->a:I

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    iget-object p1, p1, LA/Z;->b:LA/r;

    .line 14
    .line 15
    iget-object v0, p0, LA/Z;->b:LA/r;

    .line 16
    .line 17
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    return p1

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget v0, p0, LA/Z;->a:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget-object v1, p0, LA/Z;->b:LA/r;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    add-int/2addr v1, v0

    .line 12
    mul-int/lit8 v1, v1, 0x1f

    .line 13
    .line 14
    return v1
.end method

.method public final q(LS3/e;)LA/c0;
    .locals 3

    .line 1
    const-string v0, "converter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, LA/x;

    .line 7
    .line 8
    iget-object v0, p0, LA/Z;->b:LA/r;

    .line 9
    .line 10
    iget v1, p0, LA/Z;->a:I

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {p1, v1, v0, v2}, LA/x;-><init>(ILA/r;I)V

    .line 14
    .line 15
    .line 16
    return-object p1
.end method
