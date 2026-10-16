.class public final LA/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN/K0;


# instance fields
.field public final synthetic a:I

.field public b:J

.field public c:J

.field public d:Z

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LS3/e;Ljava/lang/Object;LA/n;JJZ)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LA/j;->a:I

    const-string v0, "typeConverter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, LA/j;->e:Ljava/lang/Object;

    .line 32
    sget-object v0, LN/P;->f:LN/P;

    .line 33
    invoke-static {p2, v0}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    move-result-object v0

    .line 34
    iput-object v0, p0, LA/j;->f:Ljava/lang/Object;

    if-eqz p3, :cond_0

    .line 35
    invoke-static {p3}, LA/t;->c(LA/n;)LA/n;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, LA/t;->f(LS3/e;Ljava/lang/Object;)LA/n;

    move-result-object p1

    :goto_0
    iput-object p1, p0, LA/j;->g:Ljava/lang/Object;

    .line 36
    iput-wide p4, p0, LA/j;->b:J

    .line 37
    iput-wide p6, p0, LA/j;->c:J

    .line 38
    iput-boolean p8, p0, LA/j;->d:Z

    return-void
.end method

.method public constructor <init>(Lcg/B;)V
    .locals 11

    const/4 v0, 0x1

    iput v0, p0, LA/j;->a:I

    const/4 v1, 0x0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v2, Lef/j;->c:Lef/j;

    new-instance v3, Lg4/a;

    invoke-direct {v3, p0, v1}, Lg4/a;-><init>(LA/j;I)V

    invoke-static {v2, v3}, LFe/c;->y(Lef/j;Ltf/a;)Lef/i;

    move-result-object v3

    iput-object v3, p0, LA/j;->e:Ljava/lang/Object;

    .line 3
    new-instance v3, Lg4/a;

    invoke-direct {v3, p0, v0}, Lg4/a;-><init>(LA/j;I)V

    invoke-static {v2, v3}, LFe/c;->y(Lef/j;Ltf/a;)Lef/i;

    move-result-object v2

    iput-object v2, p0, LA/j;->f:Ljava/lang/Object;

    const-wide v2, 0x7fffffffffffffffL

    .line 4
    invoke-virtual {p1, v2, v3}, Lcg/B;->readUtf8LineStrict(J)Ljava/lang/String;

    move-result-object v4

    .line 5
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    iput-wide v4, p0, LA/j;->b:J

    .line 6
    invoke-virtual {p1, v2, v3}, Lcg/B;->readUtf8LineStrict(J)Ljava/lang/String;

    move-result-object v4

    .line 7
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    iput-wide v4, p0, LA/j;->c:J

    .line 8
    invoke-virtual {p1, v2, v3}, Lcg/B;->readUtf8LineStrict(J)Ljava/lang/String;

    move-result-object v4

    .line 9
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    if-lez v4, :cond_0

    move v4, v0

    goto :goto_0

    :cond_0
    move v4, v1

    :goto_0
    iput-boolean v4, p0, LA/j;->d:Z

    .line 10
    invoke-virtual {p1, v2, v3}, Lcg/B;->readUtf8LineStrict(J)Ljava/lang/String;

    move-result-object v4

    .line 11
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 12
    new-instance v5, Lokhttp3/Headers$Builder;

    invoke-direct {v5}, Lokhttp3/Headers$Builder;-><init>()V

    move v6, v1

    :goto_1
    if-ge v6, v4, :cond_2

    .line 13
    invoke-virtual {p1, v2, v3}, Lcg/B;->readUtf8LineStrict(J)Ljava/lang/String;

    move-result-object v7

    .line 14
    sget-object v8, Lk4/e;->a:Landroid/graphics/Bitmap$Config;

    const/16 v8, 0x3a

    const/4 v9, 0x6

    .line 15
    invoke-static {v7, v8, v1, v9}, LBf/k;->v0(Ljava/lang/CharSequence;CII)I

    move-result v8

    const/4 v9, -0x1

    if-eq v8, v9, :cond_1

    .line 16
    invoke-virtual {v7, v1, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    const-string v10, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v9}, LBf/k;->V0(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    add-int/2addr v8, v0

    invoke-virtual {v7, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    const-string v8, "this as java.lang.String).substring(startIndex)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    const-string v8, "name"

    invoke-static {v9, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    sget-object v8, Lokhttp3/Headers;->b:Lokhttp3/Headers$Companion;

    .line 19
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v9}, Lokhttp3/Headers$Companion;->a(Ljava/lang/String;)V

    .line 20
    invoke-virtual {v5, v9, v7}, Lokhttp3/Headers$Builder;->c(Ljava/lang/String;Ljava/lang/String;)V

    add-int/2addr v6, v0

    goto :goto_1

    .line 21
    :cond_1
    const-string p1, "Unexpected header: "

    invoke-virtual {p1, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 22
    :cond_2
    invoke-virtual {v5}, Lokhttp3/Headers$Builder;->d()Lokhttp3/Headers;

    move-result-object p1

    iput-object p1, p0, LA/j;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lokhttp3/Response;)V
    .locals 3

    const/4 v0, 0x1

    iput v0, p0, LA/j;->a:I

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    sget-object v0, Lef/j;->c:Lef/j;

    new-instance v1, Lg4/a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lg4/a;-><init>(LA/j;I)V

    invoke-static {v0, v1}, LFe/c;->y(Lef/j;Ltf/a;)Lef/i;

    move-result-object v1

    iput-object v1, p0, LA/j;->e:Ljava/lang/Object;

    .line 25
    new-instance v1, Lg4/a;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lg4/a;-><init>(LA/j;I)V

    invoke-static {v0, v1}, LFe/c;->y(Lef/j;Ltf/a;)Lef/i;

    move-result-object v0

    iput-object v0, p0, LA/j;->f:Ljava/lang/Object;

    .line 26
    iget-wide v0, p1, Lokhttp3/Response;->k:J

    iput-wide v0, p0, LA/j;->b:J

    .line 27
    iget-wide v0, p1, Lokhttp3/Response;->l:J

    iput-wide v0, p0, LA/j;->c:J

    .line 28
    iget-object v0, p1, Lokhttp3/Response;->e:Lokhttp3/Handshake;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, LA/j;->d:Z

    .line 29
    iget-object p1, p1, Lokhttp3/Response;->f:Lokhttp3/Headers;

    iput-object p1, p0, LA/j;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lcg/A;)V
    .locals 5

    .line 1
    iget-wide v0, p0, LA/j;->b:J

    .line 2
    .line 3
    invoke-virtual {p1, v0, v1}, Lcg/A;->writeDecimalLong(J)Lcg/h;

    .line 4
    .line 5
    .line 6
    const/16 v0, 0xa

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lcg/A;->writeByte(I)Lcg/h;

    .line 9
    .line 10
    .line 11
    iget-wide v1, p0, LA/j;->c:J

    .line 12
    .line 13
    invoke-virtual {p1, v1, v2}, Lcg/A;->writeDecimalLong(J)Lcg/h;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lcg/A;->writeByte(I)Lcg/h;

    .line 17
    .line 18
    .line 19
    iget-boolean v1, p0, LA/j;->d:Z

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    const-wide/16 v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-wide/16 v1, 0x0

    .line 27
    .line 28
    :goto_0
    invoke-virtual {p1, v1, v2}, Lcg/A;->writeDecimalLong(J)Lcg/h;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lcg/A;->writeByte(I)Lcg/h;

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, LA/j;->g:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Lokhttp3/Headers;

    .line 37
    .line 38
    invoke-virtual {v1}, Lokhttp3/Headers;->size()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    int-to-long v2, v2

    .line 43
    invoke-virtual {p1, v2, v3}, Lcg/A;->writeDecimalLong(J)Lcg/h;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v0}, Lcg/A;->writeByte(I)Lcg/h;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Lokhttp3/Headers;->size()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    const/4 v3, 0x0

    .line 54
    :goto_1
    if-ge v3, v2, :cond_1

    .line 55
    .line 56
    invoke-virtual {v1, v3}, Lokhttp3/Headers;->c(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {p1, v4}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 61
    .line 62
    .line 63
    const-string v4, ": "

    .line 64
    .line 65
    invoke-virtual {p1, v4}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v3}, Lokhttp3/Headers;->f(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-interface {p1, v4}, Lcg/h;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 73
    .line 74
    .line 75
    invoke-interface {p1, v0}, Lcg/h;->writeByte(I)Lcg/h;

    .line 76
    .line 77
    .line 78
    add-int/lit8 v3, v3, 0x1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    return-void
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LA/j;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LN/Y;

    .line 4
    .line 5
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, LA/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "AnimationState(value="

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, LA/j;->f:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, LN/Y;

    .line 21
    .line 22
    invoke-virtual {v1}, LN/Y;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v1, ", velocity="

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, LA/j;->e:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, LS3/e;

    .line 37
    .line 38
    iget-object v1, v1, LS3/e;->c:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Lkotlin/jvm/internal/n;

    .line 41
    .line 42
    iget-object v2, p0, LA/j;->g:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, LA/n;

    .line 45
    .line 46
    invoke-interface {v1, v2}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", isRunning="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-boolean v1, p0, LA/j;->d:Z

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", lastFrameTimeNanos="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-wide v1, p0, LA/j;->b:J

    .line 69
    .line 70
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", finishedTimeNanos="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-wide v1, p0, LA/j;->c:J

    .line 79
    .line 80
    const/16 v3, 0x29

    .line 81
    .line 82
    invoke-static {v0, v1, v2, v3}, LA/f;->e(Ljava/lang/StringBuilder;JC)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    return-object v0

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
