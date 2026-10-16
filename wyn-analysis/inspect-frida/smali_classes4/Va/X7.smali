.class public final LVa/X7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/ma;
.implements Lh5/e;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, Lod/Y1;->b:Lod/Y1;

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {}, Lod/S1;->m()Lod/w0;

    move-result-object v1

    iput-object v1, p0, LVa/X7;->b:Ljava/lang/Object;

    .line 4
    invoke-static {}, Lod/S1;->m()Lod/w0;

    move-result-object v1

    iput-object v1, p0, LVa/X7;->c:Ljava/lang/Object;

    .line 5
    invoke-static {}, Lod/S1;->m()Lod/w0;

    move-result-object v1

    iput-object v1, p0, LVa/X7;->d:Ljava/lang/Object;

    .line 6
    iput-object v0, p0, LVa/X7;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LA7/Z;Ljava/lang/String;)V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVa/X7;->d:Ljava/lang/Object;

    .line 37
    invoke-static {p2}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 38
    iput-object p2, p0, LVa/X7;->a:Ljava/lang/Object;

    .line 39
    iget-object p1, p1, LA7/B0;->a:Ljava/lang/Object;

    check-cast p1, LA7/n0;

    .line 40
    iget-object p1, p1, LA7/n0;->g:LA7/e;

    .line 41
    sget-object p2, LA7/y;->k1:LA7/D;

    const/4 v0, 0x0

    .line 42
    invoke-virtual {p1, v0, p2}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 43
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    iput-object p1, p0, LVa/X7;->b:Ljava/lang/Object;

    return-void

    .line 44
    :cond_0
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    iput-object p1, p0, LVa/X7;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Typeface;Lz1/b;)V
    .locals 6

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, LVa/X7;->d:Ljava/lang/Object;

    .line 9
    iput-object p2, p0, LVa/X7;->a:Ljava/lang/Object;

    .line 10
    new-instance p1, Ly1/l;

    const/16 v0, 0x400

    invoke-direct {p1, v0}, Ly1/l;-><init>(I)V

    iput-object p1, p0, LVa/X7;->c:Ljava/lang/Object;

    const/4 p1, 0x6

    .line 11
    invoke-virtual {p2, p1}, Lgf/e;->a(I)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 12
    iget v2, p2, Lgf/e;->a:I

    add-int/2addr v0, v2

    .line 13
    iget-object v2, p2, Lgf/e;->d:Ljava/lang/Object;

    check-cast v2, Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    add-int/2addr v2, v0

    .line 14
    iget-object v0, p2, Lgf/e;->d:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x2

    .line 15
    new-array v0, v0, [C

    iput-object v0, p0, LVa/X7;->b:Ljava/lang/Object;

    .line 16
    invoke-virtual {p2, p1}, Lgf/e;->a(I)I

    move-result p1

    if-eqz p1, :cond_1

    .line 17
    iget v0, p2, Lgf/e;->a:I

    add-int/2addr p1, v0

    .line 18
    iget-object v0, p2, Lgf/e;->d:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr v0, p1

    .line 19
    iget-object p1, p2, Lgf/e;->d:Ljava/lang/Object;

    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    goto :goto_1

    :cond_1
    move p1, v1

    :goto_1
    move p2, v1

    :goto_2
    if-ge p2, p1, :cond_6

    .line 20
    new-instance v0, Ly1/i;

    invoke-direct {v0, p0, p2}, Ly1/i;-><init>(LVa/X7;I)V

    .line 21
    invoke-virtual {v0}, Ly1/i;->b()Lz1/a;

    move-result-object v2

    const/4 v3, 0x4

    .line 22
    invoke-virtual {v2, v3}, Lgf/e;->a(I)I

    move-result v3

    if-eqz v3, :cond_2

    iget-object v4, v2, Lgf/e;->d:Ljava/lang/Object;

    check-cast v4, Ljava/nio/ByteBuffer;

    iget v2, v2, Lgf/e;->a:I

    add-int/2addr v3, v2

    invoke-virtual {v4, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    goto :goto_3

    :cond_2
    move v2, v1

    :goto_3
    mul-int/lit8 v3, p2, 0x2

    .line 23
    iget-object v4, p0, LVa/X7;->b:Ljava/lang/Object;

    check-cast v4, [C

    invoke-static {v2, v4, v3}, Ljava/lang/Character;->toChars(I[CI)I

    .line 24
    invoke-virtual {v0}, Ly1/i;->b()Lz1/a;

    move-result-object v2

    const/16 v3, 0x10

    .line 25
    invoke-virtual {v2, v3}, Lgf/e;->a(I)I

    move-result v4

    if-eqz v4, :cond_3

    .line 26
    iget v5, v2, Lgf/e;->a:I

    add-int/2addr v4, v5

    .line 27
    iget-object v5, v2, Lgf/e;->d:Ljava/lang/Object;

    check-cast v5, Ljava/nio/ByteBuffer;

    invoke-virtual {v5, v4}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v5

    add-int/2addr v5, v4

    .line 28
    iget-object v2, v2, Lgf/e;->d:Ljava/lang/Object;

    check-cast v2, Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    goto :goto_4

    :cond_3
    move v2, v1

    :goto_4
    const/4 v4, 0x1

    if-lez v2, :cond_4

    move v2, v4

    goto :goto_5

    :cond_4
    move v2, v1

    .line 29
    :goto_5
    const-string v5, "invalid metadata codepoint length"

    invoke-static {v5, v2}, Lj1/d;->a(Ljava/lang/String;Z)V

    .line 30
    invoke-virtual {v0}, Ly1/i;->b()Lz1/a;

    move-result-object v2

    .line 31
    invoke-virtual {v2, v3}, Lgf/e;->a(I)I

    move-result v3

    if-eqz v3, :cond_5

    .line 32
    iget v5, v2, Lgf/e;->a:I

    add-int/2addr v3, v5

    .line 33
    iget-object v5, v2, Lgf/e;->d:Ljava/lang/Object;

    check-cast v5, Ljava/nio/ByteBuffer;

    invoke-virtual {v5, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v5

    add-int/2addr v5, v3

    .line 34
    iget-object v2, v2, Lgf/e;->d:Ljava/lang/Object;

    check-cast v2, Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    goto :goto_6

    :cond_5
    move v2, v1

    :goto_6
    sub-int/2addr v2, v4

    .line 35
    iget-object v3, p0, LVa/X7;->c:Ljava/lang/Object;

    check-cast v3, Ly1/l;

    invoke-virtual {v3, v0, v1, v2}, Ly1/l;->a(Ly1/i;II)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_6
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, LVa/X7;->a:Ljava/lang/Object;

    iput-object p4, p0, LVa/X7;->b:Ljava/lang/Object;

    iput-object p2, p0, LVa/X7;->c:Ljava/lang/Object;

    iput-object p3, p0, LVa/X7;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll8/e0;LS3/e;LS3/s;LS3/c;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 46
    invoke-static {p1}, Ll8/K;->j(Ljava/util/Collection;)Ll8/K;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, Ll8/K;->b:Ll8/I;

    .line 47
    sget-object p1, Ll8/e0;->e:Ll8/e0;

    .line 48
    :goto_0
    iput-object p1, p0, LVa/X7;->a:Ljava/lang/Object;

    .line 49
    iput-object p2, p0, LVa/X7;->b:Ljava/lang/Object;

    .line 50
    iput-object p3, p0, LVa/X7;->c:Ljava/lang/Object;

    .line 51
    iput-object p4, p0, LVa/X7;->d:Ljava/lang/Object;

    return-void
.end method

.method public static final c(LVa/X7;Ljava/io/File;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/c;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/h;
    .locals 0

    .line 1
    invoke-static {p1}, LVa/X7;->k(Ljava/io/File;)Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, LVa/X7;->l(Ljava/io/File;)Ljava/io/File;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 13
    .line 14
    .line 15
    new-instance p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/d;

    .line 16
    .line 17
    invoke-direct {p0, p1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/d;-><init>(Ljava/io/File;)V

    .line 18
    .line 19
    .line 20
    iput-object p0, p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/c;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/h;

    .line 21
    .line 22
    iget-object p2, p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/c;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/a;

    .line 23
    .line 24
    if-eqz p2, :cond_0

    .line 25
    .line 26
    invoke-virtual {p2, p0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    :cond_0
    new-instance p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/h;

    .line 30
    .line 31
    invoke-direct {p0, p1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/h;-><init>(Ljava/io/File;)V

    .line 32
    .line 33
    .line 34
    return-object p0
.end method

.method public static final d(LVa/X7;Ljava/io/File;LGd/a;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/c;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/i;
    .locals 11

    .line 1
    invoke-virtual {p2}, LGd/a;->e()LJd/v;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget p0, p0, LJd/v;->a:I

    .line 6
    .line 7
    const/16 v0, 0x190

    .line 8
    .line 9
    const-string v1, ", status: "

    .line 10
    .line 11
    const-string v2, "Failed to fetch media from url: "

    .line 12
    .line 13
    const/16 v3, 0x1f4

    .line 14
    .line 15
    if-gt v0, p0, :cond_0

    .line 16
    .line 17
    if-ge p0, v3, :cond_0

    .line 18
    .line 19
    sget-object v4, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 20
    .line 21
    new-instance p0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p2}, Lgc/b;->u(LGd/a;)LFd/b;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {p1}, LFd/b;->getUrl()LJd/H;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2}, LGd/a;->e()LJd/v;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    const/16 v9, 0xc

    .line 52
    .line 53
    const/4 v10, 0x0

    .line 54
    const-string v5, "ChunkedMediaDownloader"

    .line 55
    .line 56
    const/4 v7, 0x0

    .line 57
    const/4 v8, 0x0

    .line 58
    invoke-static/range {v4 .. v10}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    sget-object p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/f;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/f;

    .line 62
    .line 63
    new-instance p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/e;

    .line 64
    .line 65
    invoke-direct {p1, p0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/e;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/g;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p3, p1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/c;->a(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/e;)V

    .line 69
    .line 70
    .line 71
    return-object p0

    .line 72
    :cond_0
    if-gt v3, p0, :cond_1

    .line 73
    .line 74
    const/16 v0, 0x258

    .line 75
    .line 76
    if-ge p0, v0, :cond_1

    .line 77
    .line 78
    sget-object v3, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 79
    .line 80
    new-instance p0, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-static {p2}, Lgc/b;->u(LGd/a;)LFd/b;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-interface {p1}, LFd/b;->getUrl()LJd/H;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2}, LGd/a;->e()LJd/v;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    const/16 v8, 0xc

    .line 111
    .line 112
    const/4 v9, 0x0

    .line 113
    const-string v4, "ChunkedMediaDownloader"

    .line 114
    .line 115
    const/4 v6, 0x0

    .line 116
    const/4 v7, 0x0

    .line 117
    invoke-static/range {v3 .. v9}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    sget-object p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/f;->h:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/f;

    .line 121
    .line 122
    new-instance p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/e;

    .line 123
    .line 124
    invoke-direct {p1, p0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/e;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/g;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p3, p1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/c;->a(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/e;)V

    .line 128
    .line 129
    .line 130
    return-object p0

    .line 131
    :cond_1
    new-instance p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/h;

    .line 132
    .line 133
    invoke-direct {p0, p1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/h;-><init>(Ljava/io/File;)V

    .line 134
    .line 135
    .line 136
    return-object p0
.end method

.method public static final f(LVa/X7;Ljava/io/File;LGd/a;Llf/c;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    instance-of v3, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/b;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/b;

    .line 13
    .line 14
    iget v4, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/b;->f:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/b;->f:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/b;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/b;-><init>(LVa/X7;Llf/c;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/b;->d:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, Lkf/a;->a:Lkf/a;

    .line 34
    .line 35
    iget v5, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/b;->f:I

    .line 36
    .line 37
    const/4 v6, 0x2

    .line 38
    const/4 v7, 0x1

    .line 39
    if-eqz v5, :cond_3

    .line 40
    .line 41
    if-eq v5, v7, :cond_2

    .line 42
    .line 43
    if-ne v5, v6, :cond_1

    .line 44
    .line 45
    iget-object v0, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/b;->c:LGd/a;

    .line 46
    .line 47
    iget-object v1, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/b;->b:Ljava/io/File;

    .line 48
    .line 49
    iget-object v3, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/b;->a:LVa/X7;

    .line 50
    .line 51
    invoke-static {v2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_3

    .line 55
    .line 56
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v0

    .line 64
    :cond_2
    iget-object v0, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/b;->c:LGd/a;

    .line 65
    .line 66
    iget-object v1, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/b;->b:Ljava/io/File;

    .line 67
    .line 68
    iget-object v5, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/b;->a:LVa/X7;

    .line 69
    .line 70
    invoke-static {v2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    move-object v15, v2

    .line 74
    move-object v2, v0

    .line 75
    move-object v0, v5

    .line 76
    move-object v5, v15

    .line 77
    goto :goto_1

    .line 78
    :cond_3
    invoke-static {v2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    sget-object v8, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 82
    .line 83
    const/16 v13, 0xc

    .line 84
    .line 85
    const/4 v14, 0x0

    .line 86
    const-string v9, "ChunkedMediaDownloader"

    .line 87
    .line 88
    const-string v10, "Range header not supported, downloading full file"

    .line 89
    .line 90
    const/4 v11, 0x0

    .line 91
    const/4 v12, 0x0

    .line 92
    invoke-static/range {v8 .. v14}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->exists()Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-eqz v2, :cond_4

    .line 100
    .line 101
    const/16 v13, 0xc

    .line 102
    .line 103
    const/4 v14, 0x0

    .line 104
    const-string v9, "ChunkedMediaDownloader"

    .line 105
    .line 106
    const-string v10, "Deleting existing file and fully re-downloading it"

    .line 107
    .line 108
    const/4 v11, 0x0

    .line 109
    const/4 v12, 0x0

    .line 110
    invoke-static/range {v8 .. v14}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->delete()Z

    .line 114
    .line 115
    .line 116
    :cond_4
    iput-object v0, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/b;->a:LVa/X7;

    .line 117
    .line 118
    move-object/from16 v2, p1

    .line 119
    .line 120
    iput-object v2, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/b;->b:Ljava/io/File;

    .line 121
    .line 122
    iput-object v1, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/b;->c:LGd/a;

    .line 123
    .line 124
    iput v7, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/b;->f:I

    .line 125
    .line 126
    invoke-static {v1, v3}, Lgc/b;->g(LGd/a;Llf/c;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    if-ne v5, v4, :cond_5

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_5
    move-object v15, v2

    .line 134
    move-object v2, v1

    .line 135
    move-object v1, v15

    .line 136
    :goto_1
    check-cast v5, Lio/ktor/utils/io/t;

    .line 137
    .line 138
    invoke-static {v1}, LFe/c;->H(Ljava/io/File;)Lio/ktor/utils/io/P;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    iput-object v0, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/b;->a:LVa/X7;

    .line 143
    .line 144
    iput-object v1, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/b;->b:Ljava/io/File;

    .line 145
    .line 146
    iput-object v2, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/b;->c:LGd/a;

    .line 147
    .line 148
    iput v6, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/b;->f:I

    .line 149
    .line 150
    invoke-static {v5, v7, v3}, Lio/ktor/utils/io/N;->d(Lio/ktor/utils/io/t;Lio/ktor/utils/io/P;Llf/c;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    if-ne v3, v4, :cond_6

    .line 155
    .line 156
    :goto_2
    return-object v4

    .line 157
    :cond_6
    move-object v15, v3

    .line 158
    move-object v3, v0

    .line 159
    move-object v0, v2

    .line 160
    move-object v2, v15

    .line 161
    :goto_3
    check-cast v2, Ljava/lang/Number;

    .line 162
    .line 163
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 164
    .line 165
    .line 166
    move-result-wide v4

    .line 167
    sget-object v6, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 168
    .line 169
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    new-instance v2, Ljava/lang/StringBuilder;

    .line 173
    .line 174
    const-string v3, "Downloaded full response: "

    .line 175
    .line 176
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-static {v0}, Lff/B;->h(LGd/a;)Ljava/lang/Long;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    const-string v0, " and saved to disk: "

    .line 187
    .line 188
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    const-string v0, " bytes, file size: "

    .line 195
    .line 196
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 200
    .line 201
    .line 202
    move-result-wide v0

    .line 203
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v8

    .line 210
    const/16 v11, 0xc

    .line 211
    .line 212
    const/4 v12, 0x0

    .line 213
    const-string v7, "ChunkedMediaDownloader"

    .line 214
    .line 215
    const/4 v9, 0x0

    .line 216
    const/4 v10, 0x0

    .line 217
    invoke-static/range {v6 .. v12}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    sget-object v0, Lef/C;->a:Lef/C;

    .line 221
    .line 222
    return-object v0
.end method

.method public static final g(LVa/X7;Ljava/lang/String;JILjava/lang/String;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    new-instance v0, LFd/c;

    .line 2
    .line 3
    invoke-direct {v0}, LFd/c;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0, p1}, LFd/e;->b(LFd/c;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, LAf/r;

    .line 10
    .line 11
    const/16 v1, 0x14

    .line 12
    .line 13
    invoke-direct {p1, p0, v1}, LAf/r;-><init>(Ljava/lang/Object;I)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, p1}, LCd/b0;->a(LFd/c;Ltf/l;)V

    .line 17
    .line 18
    .line 19
    new-instance v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/a;

    .line 20
    .line 21
    move-object v5, p0

    .line 22
    move-wide v3, p2

    .line 23
    move v6, p4

    .line 24
    move-object v7, p5

    .line 25
    invoke-direct/range {v2 .. v7}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/a;-><init>(JLVa/X7;ILjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v2}, LFd/e;->a(LJd/r;Ltf/l;)V

    .line 29
    .line 30
    .line 31
    sget-object p0, LJd/s;->b:LJd/s;

    .line 32
    .line 33
    invoke-virtual {v0, p0}, LFd/c;->c(LJd/s;)V

    .line 34
    .line 35
    .line 36
    new-instance p0, LS3/s;

    .line 37
    .line 38
    iget-object p1, v5, LVa/X7;->d:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Lwd/c;

    .line 41
    .line 42
    invoke-direct {p0, v0, p1}, LS3/s;-><init>(LFd/c;Lwd/c;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p6}, LS3/s;->p(Llf/c;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method

.method public static final h(LVa/X7;Ljava/io/File;LGd/a;)V
    .locals 7

    .line 1
    invoke-interface {p2}, LJd/q;->a()LJd/m;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object p2, LJd/p;->a:Ljava/util/List;

    .line 6
    .line 7
    const-string p2, "ETag"

    .line 8
    .line 9
    invoke-interface {p0, p2}, LNd/j;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 16
    .line 17
    const-string p2, "ETag: "

    .line 18
    .line 19
    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const/16 v5, 0xc

    .line 24
    .line 25
    const/4 v6, 0x0

    .line 26
    const-string v1, "ChunkedMediaDownloader"

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    const/4 v4, 0x0

    .line 30
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, LVa/X7;->k(Ljava/io/File;)Ljava/io/File;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    sget-object p2, LBf/a;->a:Ljava/nio/charset/Charset;

    .line 38
    .line 39
    invoke-static {p1, p0, p2}, Lqf/i;->Y(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 44
    .line 45
    const/16 v5, 0xc

    .line 46
    .line 47
    const/4 v6, 0x0

    .line 48
    const-string v1, "ChunkedMediaDownloader"

    .line 49
    .line 50
    const-string v2, "No ETag in header"

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    const/4 v4, 0x0

    .line 54
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->warn$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-static {p1}, LVa/X7;->k(Ljava/io/File;)Ljava/io/File;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public static final i(LVa/X7;Ljava/io/File;LGd/a;Llf/c;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    instance-of v2, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/d;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/d;

    .line 11
    .line 12
    iget v3, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/d;->f:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/d;->f:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/d;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/d;-><init>(LVa/X7;Llf/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/d;->d:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, Lkf/a;->a:Lkf/a;

    .line 32
    .line 33
    iget v4, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/d;->f:I

    .line 34
    .line 35
    const/4 v5, 0x2

    .line 36
    const/4 v6, 0x1

    .line 37
    if-eqz v4, :cond_3

    .line 38
    .line 39
    if-eq v4, v6, :cond_2

    .line 40
    .line 41
    if-ne v4, v5, :cond_1

    .line 42
    .line 43
    iget-object v0, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/d;->c:Lio/ktor/utils/io/t;

    .line 44
    .line 45
    iget-object v4, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/d;->b:Ljava/io/File;

    .line 46
    .line 47
    iget-object v7, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/d;->a:LVa/X7;

    .line 48
    .line 49
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v0

    .line 61
    :cond_2
    iget-object v0, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/d;->b:Ljava/io/File;

    .line 62
    .line 63
    iget-object v4, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/d;->a:LVa/X7;

    .line 64
    .line 65
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move-object/from16 v17, v1

    .line 69
    .line 70
    move-object v1, v0

    .line 71
    move-object v0, v4

    .line 72
    move-object/from16 v4, v17

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iput-object v0, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/d;->a:LVa/X7;

    .line 79
    .line 80
    move-object/from16 v1, p1

    .line 81
    .line 82
    iput-object v1, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/d;->b:Ljava/io/File;

    .line 83
    .line 84
    iput v6, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/d;->f:I

    .line 85
    .line 86
    move-object/from16 v4, p2

    .line 87
    .line 88
    invoke-static {v4, v2}, Lgc/b;->g(LGd/a;Llf/c;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    if-ne v4, v3, :cond_4

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    :goto_1
    check-cast v4, Lio/ktor/utils/io/t;

    .line 96
    .line 97
    move-object v7, v0

    .line 98
    move-object v0, v4

    .line 99
    move-object v4, v1

    .line 100
    :cond_5
    invoke-interface {v0}, Lio/ktor/utils/io/t;->h()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-nez v1, :cond_7

    .line 105
    .line 106
    iget-object v1, v7, LVa/X7;->a:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/p;

    .line 109
    .line 110
    iget v1, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/p;->a:I

    .line 111
    .line 112
    int-to-long v8, v1

    .line 113
    const-wide/16 v10, 0x2

    .line 114
    .line 115
    mul-long/2addr v8, v10

    .line 116
    iput-object v7, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/d;->a:LVa/X7;

    .line 117
    .line 118
    iput-object v4, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/d;->b:Ljava/io/File;

    .line 119
    .line 120
    iput-object v0, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/d;->c:Lio/ktor/utils/io/t;

    .line 121
    .line 122
    iput v5, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/d;->f:I

    .line 123
    .line 124
    invoke-static {v0, v8, v9, v2}, Lio/ktor/utils/io/N;->l(Lio/ktor/utils/io/t;JLlf/c;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    if-ne v1, v3, :cond_6

    .line 129
    .line 130
    :goto_2
    return-object v3

    .line 131
    :cond_6
    :goto_3
    check-cast v1, LPf/i;

    .line 132
    .line 133
    :goto_4
    const-string v8, "<this>"

    .line 134
    .line 135
    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-interface {v1}, LPf/i;->exhausted()Z

    .line 139
    .line 140
    .line 141
    move-result v9

    .line 142
    if-nez v9, :cond_5

    .line 143
    .line 144
    const/4 v9, -0x1

    .line 145
    invoke-static {v1, v9}, LPf/j;->f(LPf/i;I)[B

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    new-instance v8, Ljava/io/FileOutputStream;

    .line 153
    .line 154
    invoke-direct {v8, v4, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    .line 155
    .line 156
    .line 157
    :try_start_0
    invoke-virtual {v8, v9}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 158
    .line 159
    .line 160
    invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V

    .line 161
    .line 162
    .line 163
    sget-object v10, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 164
    .line 165
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    new-instance v8, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    const-string v9, "dst file length: "

    .line 171
    .line 172
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v4}, Ljava/io/File;->length()J

    .line 176
    .line 177
    .line 178
    move-result-wide v11

    .line 179
    invoke-virtual {v8, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    const-string v9, " bytes"

    .line 183
    .line 184
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v12

    .line 191
    const/16 v15, 0xc

    .line 192
    .line 193
    const/16 v16, 0x0

    .line 194
    .line 195
    const-string v11, "ChunkedMediaDownloader"

    .line 196
    .line 197
    const/4 v13, 0x0

    .line 198
    const/4 v14, 0x0

    .line 199
    invoke-static/range {v10 .. v16}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    goto :goto_4

    .line 203
    :catchall_0
    move-exception v0

    .line 204
    move-object v1, v0

    .line 205
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 206
    :catchall_1
    move-exception v0

    .line 207
    invoke-static {v8, v1}, LBa/c;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 208
    .line 209
    .line 210
    throw v0

    .line 211
    :cond_7
    sget-object v0, Lef/C;->a:Lef/C;

    .line 212
    .line 213
    return-object v0
.end method

.method public static k(Ljava/io/File;)Ljava/io/File;
    .locals 3

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/io/File;->getParent()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p0, ".etag"

    .line 20
    .line 21
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-direct {v0, v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method

.method public static l(Ljava/io/File;)Ljava/io/File;
    .locals 3

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/io/File;->getParent()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p0, ".range"

    .line 20
    .line 21
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-direct {v0, v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/HashMap;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "sqlite_error"

    .line 2
    .line 3
    iput-object v0, p0, LVa/X7;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, LVa/X7;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p1, p0, LVa/X7;->d:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method

.method public b(Ljava/io/Serializable;)V
    .locals 0

    .line 1
    iput-object p1, p0, LVa/X7;->a:Ljava/lang/Object;

    .line 2
    .line 3
    return-void
.end method

.method public e(LVa/na;)Z
    .locals 4

    .line 1
    iget-object v0, p0, LVa/X7;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LVa/A7;

    .line 4
    .line 5
    iget-object v0, v0, LVa/A7;->b:LVa/ha;

    .line 6
    .line 7
    iget-object v1, p0, LVa/X7;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, LVa/y7;

    .line 10
    .line 11
    iget-object v2, p0, LVa/X7;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Ljava/util/List;

    .line 14
    .line 15
    iget-object v3, p0, LVa/X7;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, LVa/x8;

    .line 18
    .line 19
    invoke-virtual {v0, p1, v3, v1, v2}, LVa/ha;->c(LVa/na;LVa/x8;LVa/y7;Ljava/util/List;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1
.end method

.method public j(Ljava/io/File;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, LVa/X7;->l(Ljava/io/File;)Ljava/io/File;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return p1
.end method

.method public m(Ljava/lang/Object;Luc/c;)V
    .locals 2

    .line 1
    iget-object v0, p0, LVa/X7;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Luc/n;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Luc/n;->a(Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    const/4 p2, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v0, Luc/a;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, v1, p0, p2}, Luc/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    move-object p2, v0

    .line 20
    :goto_0
    iget-object v0, p0, LVa/X7;->a:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Luc/f;

    .line 23
    .line 24
    iget-object v1, p0, LVa/X7;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Ljava/lang/String;

    .line 27
    .line 28
    invoke-interface {v0, v1, p1, p2}, Luc/f;->j(Ljava/lang/String;Ljava/nio/ByteBuffer;Luc/e;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public n(Luc/b;)V
    .locals 4

    .line 1
    iget-object v0, p0, LVa/X7;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, LVa/X7;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Luc/f;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    iget-object v3, p0, LVa/X7;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v3, Lab/b;

    .line 13
    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v2, Lu0/w0;

    .line 20
    .line 21
    invoke-direct {v2, p0, p1}, Lu0/w0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-interface {v1, v0, v2, v3}, Luc/f;->i(Ljava/lang/String;Luc/d;Lab/b;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    if-nez p1, :cond_2

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_2
    new-instance v2, Lu0/w0;

    .line 32
    .line 33
    invoke-direct {v2, p0, p1}, Lu0/w0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :goto_1
    invoke-interface {v1, v0, v2}, Luc/f;->l(Ljava/lang/String;Luc/d;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public o()Landroid/os/Bundle;
    .locals 15

    .line 1
    iget-object v0, p0, LVa/X7;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/os/Bundle;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iget-object v2, p0, LVa/X7;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v2, LA7/Z;

    .line 9
    .line 10
    if-nez v0, :cond_10

    .line 11
    .line 12
    invoke-virtual {v2}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v3, p0, LVa/X7;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Ljava/lang/String;

    .line 19
    .line 20
    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_f

    .line 25
    .line 26
    :try_start_0
    new-instance v3, Landroid/os/Bundle;

    .line 27
    .line 28
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance v4, Lorg/json/JSONArray;

    .line 32
    .line 33
    invoke-direct {v4, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    move v5, v0

    .line 38
    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    .line 39
    .line 40
    .line 41
    move-result v6
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 42
    if-ge v5, v6, :cond_e

    .line 43
    .line 44
    :try_start_1
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    const-string v7, "n"

    .line 49
    .line 50
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    const-string v8, "t"

    .line 55
    .line 56
    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    .line 61
    .line 62
    .line 63
    move-result v9

    .line 64
    const/4 v10, 0x1

    .line 65
    const/16 v11, 0x64

    .line 66
    .line 67
    const/4 v12, 0x2

    .line 68
    const/4 v13, 0x3

    .line 69
    const/4 v14, 0x4

    .line 70
    if-eq v9, v11, :cond_4

    .line 71
    .line 72
    const/16 v11, 0x6c

    .line 73
    .line 74
    if-eq v9, v11, :cond_3

    .line 75
    .line 76
    const/16 v11, 0x73

    .line 77
    .line 78
    if-eq v9, v11, :cond_2

    .line 79
    .line 80
    const/16 v11, 0xd18

    .line 81
    .line 82
    if-eq v9, v11, :cond_1

    .line 83
    .line 84
    const/16 v11, 0xd75

    .line 85
    .line 86
    if-eq v9, v11, :cond_0

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_0
    const-string v9, "la"

    .line 90
    .line 91
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v9

    .line 95
    if-eqz v9, :cond_5

    .line 96
    .line 97
    move v9, v14

    .line 98
    goto :goto_2

    .line 99
    :cond_1
    const-string v9, "ia"

    .line 100
    .line 101
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v9

    .line 105
    if-eqz v9, :cond_5

    .line 106
    .line 107
    move v9, v13

    .line 108
    goto :goto_2

    .line 109
    :cond_2
    const-string v9, "s"

    .line 110
    .line 111
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v9

    .line 115
    if-eqz v9, :cond_5

    .line 116
    .line 117
    move v9, v0

    .line 118
    goto :goto_2

    .line 119
    :cond_3
    const-string v9, "l"

    .line 120
    .line 121
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v9

    .line 125
    if-eqz v9, :cond_5

    .line 126
    .line 127
    move v9, v12

    .line 128
    goto :goto_2

    .line 129
    :cond_4
    const-string v9, "d"

    .line 130
    .line 131
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v9
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 135
    if-eqz v9, :cond_5

    .line 136
    .line 137
    move v9, v10

    .line 138
    goto :goto_2

    .line 139
    :cond_5
    :goto_1
    const/4 v9, -0x1

    .line 140
    :goto_2
    const-string v11, "v"

    .line 141
    .line 142
    if-eqz v9, :cond_c

    .line 143
    .line 144
    if-eq v9, v10, :cond_b

    .line 145
    .line 146
    if-eq v9, v12, :cond_a

    .line 147
    .line 148
    iget-object v10, v2, LA7/B0;->a:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v10, LA7/n0;

    .line 151
    .line 152
    if-eq v9, v13, :cond_8

    .line 153
    .line 154
    if-eq v9, v14, :cond_6

    .line 155
    .line 156
    :try_start_2
    invoke-virtual {v2}, LA7/B0;->zzj()LA7/N;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    iget-object v6, v6, LA7/N;->f:LA7/P;

    .line 161
    .line 162
    const-string v7, "Unrecognized persisted bundle type. Type"

    .line 163
    .line 164
    invoke-virtual {v6, v7, v8}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    goto/16 :goto_5

    .line 168
    .line 169
    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpn;->zza()Z

    .line 170
    .line 171
    .line 172
    move-result v8

    .line 173
    if-eqz v8, :cond_d

    .line 174
    .line 175
    iget-object v8, v10, LA7/n0;->g:LA7/e;

    .line 176
    .line 177
    sget-object v9, LA7/y;->I0:LA7/D;

    .line 178
    .line 179
    invoke-virtual {v8, v1, v9}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 180
    .line 181
    .line 182
    move-result v8

    .line 183
    if-eqz v8, :cond_d

    .line 184
    .line 185
    new-instance v8, Lorg/json/JSONArray;

    .line 186
    .line 187
    invoke-virtual {v6, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    invoke-direct {v8, v6}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    .line 195
    .line 196
    .line 197
    move-result v6

    .line 198
    new-array v9, v6, [J

    .line 199
    .line 200
    move v10, v0

    .line 201
    :goto_3
    if-ge v10, v6, :cond_7

    .line 202
    .line 203
    invoke-virtual {v8, v10}, Lorg/json/JSONArray;->optLong(I)J

    .line 204
    .line 205
    .line 206
    move-result-wide v11

    .line 207
    aput-wide v11, v9, v10

    .line 208
    .line 209
    add-int/lit8 v10, v10, 0x1

    .line 210
    .line 211
    goto :goto_3

    .line 212
    :cond_7
    invoke-virtual {v3, v7, v9}, Landroid/os/BaseBundle;->putLongArray(Ljava/lang/String;[J)V

    .line 213
    .line 214
    .line 215
    goto :goto_5

    .line 216
    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpn;->zza()Z

    .line 217
    .line 218
    .line 219
    move-result v8

    .line 220
    if-eqz v8, :cond_d

    .line 221
    .line 222
    iget-object v8, v10, LA7/n0;->g:LA7/e;

    .line 223
    .line 224
    sget-object v9, LA7/y;->I0:LA7/D;

    .line 225
    .line 226
    invoke-virtual {v8, v1, v9}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 227
    .line 228
    .line 229
    move-result v8

    .line 230
    if-eqz v8, :cond_d

    .line 231
    .line 232
    new-instance v8, Lorg/json/JSONArray;

    .line 233
    .line 234
    invoke-virtual {v6, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v6

    .line 238
    invoke-direct {v8, v6}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    .line 242
    .line 243
    .line 244
    move-result v6

    .line 245
    new-array v9, v6, [I

    .line 246
    .line 247
    move v10, v0

    .line 248
    :goto_4
    if-ge v10, v6, :cond_9

    .line 249
    .line 250
    invoke-virtual {v8, v10}, Lorg/json/JSONArray;->optInt(I)I

    .line 251
    .line 252
    .line 253
    move-result v11

    .line 254
    aput v11, v9, v10

    .line 255
    .line 256
    add-int/lit8 v10, v10, 0x1

    .line 257
    .line 258
    goto :goto_4

    .line 259
    :cond_9
    invoke-virtual {v3, v7, v9}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    .line 260
    .line 261
    .line 262
    goto :goto_5

    .line 263
    :cond_a
    invoke-virtual {v6, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v6

    .line 267
    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 268
    .line 269
    .line 270
    move-result-wide v8

    .line 271
    invoke-virtual {v3, v7, v8, v9}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 272
    .line 273
    .line 274
    goto :goto_5

    .line 275
    :cond_b
    invoke-virtual {v6, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v6

    .line 279
    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 280
    .line 281
    .line 282
    move-result-wide v8

    .line 283
    invoke-virtual {v3, v7, v8, v9}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    .line 284
    .line 285
    .line 286
    goto :goto_5

    .line 287
    :cond_c
    invoke-virtual {v6, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v6

    .line 291
    invoke-virtual {v3, v7, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0

    .line 292
    .line 293
    .line 294
    goto :goto_5

    .line 295
    :catch_0
    :try_start_3
    invoke-virtual {v2}, LA7/B0;->zzj()LA7/N;

    .line 296
    .line 297
    .line 298
    move-result-object v6

    .line 299
    iget-object v6, v6, LA7/N;->f:LA7/P;

    .line 300
    .line 301
    const-string v7, "Error reading value from SharedPreferences. Value dropped"

    .line 302
    .line 303
    invoke-virtual {v6, v7}, LA7/P;->c(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    :cond_d
    :goto_5
    add-int/lit8 v5, v5, 0x1

    .line 307
    .line 308
    goto/16 :goto_0

    .line 309
    .line 310
    :cond_e
    iput-object v3, p0, LVa/X7;->c:Ljava/lang/Object;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1

    .line 311
    .line 312
    goto :goto_6

    .line 313
    :catch_1
    invoke-virtual {v2}, LA7/B0;->zzj()LA7/N;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    const-string v3, "Error loading bundle from SharedPreferences. Values will be lost"

    .line 318
    .line 319
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 320
    .line 321
    invoke-virtual {v0, v3}, LA7/P;->c(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    :cond_f
    :goto_6
    iget-object v0, p0, LVa/X7;->c:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v0, Landroid/os/Bundle;

    .line 327
    .line 328
    if-nez v0, :cond_10

    .line 329
    .line 330
    iget-object v0, p0, LVa/X7;->b:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v0, Landroid/os/Bundle;

    .line 333
    .line 334
    iput-object v0, p0, LVa/X7;->c:Ljava/lang/Object;

    .line 335
    .line 336
    :cond_10
    iget-object v0, v2, LA7/B0;->a:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast v0, LA7/n0;

    .line 339
    .line 340
    iget-object v0, v0, LA7/n0;->g:LA7/e;

    .line 341
    .line 342
    sget-object v2, LA7/y;->k1:LA7/D;

    .line 343
    .line 344
    invoke-virtual {v0, v1, v2}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 345
    .line 346
    .line 347
    move-result v0

    .line 348
    if-eqz v0, :cond_11

    .line 349
    .line 350
    new-instance v0, Landroid/os/Bundle;

    .line 351
    .line 352
    iget-object v1, p0, LVa/X7;->c:Ljava/lang/Object;

    .line 353
    .line 354
    check-cast v1, Landroid/os/Bundle;

    .line 355
    .line 356
    invoke-static {v1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 360
    .line 361
    .line 362
    return-object v0

    .line 363
    :cond_11
    iget-object v0, p0, LVa/X7;->c:Ljava/lang/Object;

    .line 364
    .line 365
    check-cast v0, Landroid/os/Bundle;

    .line 366
    .line 367
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 368
    .line 369
    .line 370
    return-object v0
.end method

.method public p(Landroid/os/Bundle;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v1, LVa/X7;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v3, LA7/Z;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    new-instance v0, Landroid/os/Bundle;

    .line 13
    .line 14
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 15
    .line 16
    .line 17
    :cond_0
    move-object v4, v0

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    iget-object v4, v3, LA7/B0;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v4, LA7/n0;

    .line 22
    .line 23
    iget-object v4, v4, LA7/n0;->g:LA7/e;

    .line 24
    .line 25
    sget-object v5, LA7/y;->k1:LA7/D;

    .line 26
    .line 27
    invoke-virtual {v4, v2, v5}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    new-instance v4, Landroid/os/Bundle;

    .line 34
    .line 35
    invoke-direct {v4, v0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-virtual {v3}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-virtual {v4}, Landroid/os/BaseBundle;->size()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-object v6, v1, LVa/X7;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v6, Ljava/lang/String;

    .line 53
    .line 54
    if-nez v0, :cond_2

    .line 55
    .line 56
    invoke-interface {v5, v6}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 57
    .line 58
    .line 59
    goto/16 :goto_6

    .line 60
    .line 61
    :cond_2
    new-instance v7, Lorg/json/JSONArray;

    .line 62
    .line 63
    invoke-direct {v7}, Lorg/json/JSONArray;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    :cond_3
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_e

    .line 79
    .line 80
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v4, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    if-eqz v9, :cond_3

    .line 91
    .line 92
    :try_start_0
    new-instance v10, Lorg/json/JSONObject;

    .line 93
    .line 94
    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 95
    .line 96
    .line 97
    const-string v11, "n"

    .line 98
    .line 99
    invoke-virtual {v10, v11, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 100
    .line 101
    .line 102
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpn;->zza()Z

    .line 103
    .line 104
    .line 105
    move-result v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_3

    .line 106
    const-string v11, "Cannot serialize bundle value to SharedPreferences. Type"

    .line 107
    .line 108
    const-string v12, "d"

    .line 109
    .line 110
    const-string v13, "l"

    .line 111
    .line 112
    const-string v14, "s"

    .line 113
    .line 114
    const-string v15, "v"

    .line 115
    .line 116
    const-string v2, "t"

    .line 117
    .line 118
    if-eqz v0, :cond_9

    .line 119
    .line 120
    :try_start_1
    iget-object v0, v3, LA7/B0;->a:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, LA7/n0;

    .line 123
    .line 124
    iget-object v0, v0, LA7/n0;->g:LA7/e;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2

    .line 125
    .line 126
    move-object/from16 v16, v3

    .line 127
    .line 128
    :try_start_2
    sget-object v3, LA7/y;->I0:LA7/D;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    .line 129
    .line 130
    move-object/from16 p1, v8

    .line 131
    .line 132
    const/4 v8, 0x0

    .line 133
    :try_start_3
    invoke-virtual {v0, v8, v3}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_a

    .line 138
    .line 139
    instance-of v0, v9, Ljava/lang/String;

    .line 140
    .line 141
    if-eqz v0, :cond_4

    .line 142
    .line 143
    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {v10, v15, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v10, v2, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 151
    .line 152
    .line 153
    goto/16 :goto_4

    .line 154
    .line 155
    :catch_0
    move-exception v0

    .line 156
    goto/16 :goto_5

    .line 157
    .line 158
    :cond_4
    instance-of v0, v9, Ljava/lang/Long;

    .line 159
    .line 160
    if-eqz v0, :cond_5

    .line 161
    .line 162
    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {v10, v15, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v10, v2, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 170
    .line 171
    .line 172
    goto/16 :goto_4

    .line 173
    .line 174
    :cond_5
    instance-of v0, v9, [I

    .line 175
    .line 176
    if-eqz v0, :cond_6

    .line 177
    .line 178
    check-cast v9, [I

    .line 179
    .line 180
    invoke-static {v9}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-virtual {v10, v15, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 185
    .line 186
    .line 187
    const-string v0, "ia"

    .line 188
    .line 189
    invoke-virtual {v10, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 190
    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_6
    instance-of v0, v9, [J

    .line 194
    .line 195
    if-eqz v0, :cond_7

    .line 196
    .line 197
    check-cast v9, [J

    .line 198
    .line 199
    invoke-static {v9}, Ljava/util/Arrays;->toString([J)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-virtual {v10, v15, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 204
    .line 205
    .line 206
    const-string v0, "la"

    .line 207
    .line 208
    invoke-virtual {v10, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 209
    .line 210
    .line 211
    goto :goto_4

    .line 212
    :cond_7
    instance-of v0, v9, Ljava/lang/Double;

    .line 213
    .line 214
    if-eqz v0, :cond_8

    .line 215
    .line 216
    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-virtual {v10, v15, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v10, v2, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 224
    .line 225
    .line 226
    goto :goto_4

    .line 227
    :cond_8
    invoke-virtual/range {v16 .. v16}, LA7/B0;->zzj()LA7/N;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 232
    .line 233
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    invoke-virtual {v0, v11, v2}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    :goto_2
    move-object v2, v8

    .line 241
    move-object/from16 v3, v16

    .line 242
    .line 243
    move-object/from16 v8, p1

    .line 244
    .line 245
    goto/16 :goto_1

    .line 246
    .line 247
    :catch_1
    move-exception v0

    .line 248
    :goto_3
    move-object/from16 p1, v8

    .line 249
    .line 250
    const/4 v8, 0x0

    .line 251
    goto :goto_5

    .line 252
    :catch_2
    move-exception v0

    .line 253
    move-object/from16 v16, v3

    .line 254
    .line 255
    goto :goto_3

    .line 256
    :cond_9
    move-object/from16 v16, v3

    .line 257
    .line 258
    move-object/from16 p1, v8

    .line 259
    .line 260
    const/4 v8, 0x0

    .line 261
    :cond_a
    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-virtual {v10, v15, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 266
    .line 267
    .line 268
    instance-of v0, v9, Ljava/lang/String;

    .line 269
    .line 270
    if-eqz v0, :cond_b

    .line 271
    .line 272
    invoke-virtual {v10, v2, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 273
    .line 274
    .line 275
    goto :goto_4

    .line 276
    :cond_b
    instance-of v0, v9, Ljava/lang/Long;

    .line 277
    .line 278
    if-eqz v0, :cond_c

    .line 279
    .line 280
    invoke-virtual {v10, v2, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 281
    .line 282
    .line 283
    goto :goto_4

    .line 284
    :cond_c
    instance-of v0, v9, Ljava/lang/Double;

    .line 285
    .line 286
    if-eqz v0, :cond_d

    .line 287
    .line 288
    invoke-virtual {v10, v2, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 289
    .line 290
    .line 291
    :goto_4
    invoke-virtual {v7, v10}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 292
    .line 293
    .line 294
    goto :goto_2

    .line 295
    :cond_d
    invoke-virtual/range {v16 .. v16}, LA7/B0;->zzj()LA7/N;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 300
    .line 301
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    invoke-virtual {v0, v11, v2}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0

    .line 306
    .line 307
    .line 308
    goto :goto_2

    .line 309
    :catch_3
    move-exception v0

    .line 310
    move-object/from16 v16, v3

    .line 311
    .line 312
    move-object/from16 p1, v8

    .line 313
    .line 314
    move-object v8, v2

    .line 315
    :goto_5
    invoke-virtual/range {v16 .. v16}, LA7/B0;->zzj()LA7/N;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    const-string v3, "Cannot serialize bundle value to SharedPreferences"

    .line 320
    .line 321
    iget-object v2, v2, LA7/N;->f:LA7/P;

    .line 322
    .line 323
    invoke-virtual {v2, v3, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    goto :goto_2

    .line 327
    :cond_e
    invoke-virtual {v7}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    invoke-interface {v5, v6, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 332
    .line 333
    .line 334
    :goto_6
    invoke-interface {v5}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 335
    .line 336
    .line 337
    iput-object v4, v1, LVa/X7;->c:Ljava/lang/Object;

    .line 338
    .line 339
    return-void
.end method
