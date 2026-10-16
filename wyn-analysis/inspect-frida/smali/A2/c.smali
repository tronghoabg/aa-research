.class public final LA2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh6/f;


# instance fields
.field public final a:J

.field public final b:Ll8/e0;


# direct methods
.method public synthetic constructor <init>(JLl8/e0;)V
    .locals 0

    .line 1
    iput-wide p1, p0, LA2/c;->a:J

    iput-object p3, p0, LA2/c;->b:Ll8/e0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(J)I
    .locals 2

    .line 1
    iget-wide v0, p0, LA2/c;->a:J

    .line 2
    .line 3
    cmp-long p1, v0, p1

    .line 4
    .line 5
    if-lez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 p1, -0x1

    .line 10
    return p1
.end method

.method public g(J)Ljava/util/List;
    .locals 2

    .line 1
    iget-wide v0, p0, LA2/c;->a:J

    .line 2
    .line 3
    cmp-long p1, p1, v0

    .line 4
    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LA2/c;->b:Ll8/e0;

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    sget-object p1, Ll8/K;->b:Ll8/I;

    .line 11
    .line 12
    sget-object p1, Ll8/e0;->e:Ll8/e0;

    .line 13
    .line 14
    return-object p1
.end method

.method public k(I)J
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 p1, 0x0

    .line 6
    :goto_0
    invoke-static {p1}, Lu6/a;->e(Z)V

    .line 7
    .line 8
    .line 9
    iget-wide v0, p0, LA2/c;->a:J

    .line 10
    .line 11
    return-wide v0
.end method

.method public p()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method
