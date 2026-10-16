.class public final Lb4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb4/g;


# instance fields
.field public final synthetic a:I

.field public final b:Lh4/l;

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lh4/l;I)V
    .locals 0

    .line 1
    iput p3, p0, Lb4/c;->a:I

    iput-object p1, p0, Lb4/c;->c:Ljava/lang/Object;

    iput-object p2, p0, Lb4/c;->b:Lh4/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljf/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    const/4 p1, 0x2

    .line 2
    iget-object v0, p0, Lb4/c;->b:Lh4/l;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iget-object v2, p0, Lb4/c;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iget v3, p0, Lb4/c;->a:I

    .line 8
    .line 9
    packed-switch v3, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v2, Landroid/graphics/drawable/Drawable;

    .line 13
    .line 14
    sget-object v3, Lk4/e;->a:Landroid/graphics/Bitmap$Config;

    .line 15
    .line 16
    instance-of v3, v2, Landroid/graphics/drawable/VectorDrawable;

    .line 17
    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    instance-of v3, v2, Lu3/p;

    .line 21
    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    :cond_0
    const/4 v1, 0x1

    .line 25
    :cond_1
    new-instance v3, Lb4/d;

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    iget-object v4, v0, Lh4/l;->b:Landroid/graphics/Bitmap$Config;

    .line 30
    .line 31
    iget-object v5, v0, Lh4/l;->c:Li4/f;

    .line 32
    .line 33
    iget v6, v0, Lh4/l;->d:I

    .line 34
    .line 35
    iget-boolean v7, v0, Lh4/l;->e:Z

    .line 36
    .line 37
    invoke-static {v2, v4, v5, v6, v7}, Lvf/a;->l(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;Li4/f;IZ)Landroid/graphics/Bitmap;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    iget-object v0, v0, Lh4/l;->a:Landroid/content/Context;

    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    new-instance v4, Landroid/graphics/drawable/BitmapDrawable;

    .line 48
    .line 49
    invoke-direct {v4, v0, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 50
    .line 51
    .line 52
    move-object v2, v4

    .line 53
    :cond_2
    invoke-direct {v3, v2, v1, p1}, Lb4/d;-><init>(Landroid/graphics/drawable/Drawable;ZI)V

    .line 54
    .line 55
    .line 56
    return-object v3

    .line 57
    :pswitch_0
    check-cast v2, Ljava/nio/ByteBuffer;

    .line 58
    .line 59
    :try_start_0
    new-instance v3, Lcg/g;

    .line 60
    .line 61
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, v2}, Lcg/g;->write(Ljava/nio/ByteBuffer;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 68
    .line 69
    .line 70
    new-instance v1, Lb4/m;

    .line 71
    .line 72
    iget-object v0, v0, Lh4/l;->a:Landroid/content/Context;

    .line 73
    .line 74
    new-instance v2, LZ3/m;

    .line 75
    .line 76
    sget-object v4, Lk4/e;->a:Landroid/graphics/Bitmap$Config;

    .line 77
    .line 78
    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 83
    .line 84
    .line 85
    const/4 v4, 0x0

    .line 86
    invoke-direct {v2, v3, v0, v4}, LZ3/m;-><init>(Lcg/i;Ljava/io/File;LA6/c;)V

    .line 87
    .line 88
    .line 89
    invoke-direct {v1, v2, v4, p1}, Lb4/m;-><init>(LZ3/k;Ljava/lang/String;I)V

    .line 90
    .line 91
    .line 92
    return-object v1

    .line 93
    :catchall_0
    move-exception p1

    .line 94
    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 95
    .line 96
    .line 97
    throw p1

    .line 98
    :pswitch_1
    new-instance v3, Lb4/d;

    .line 99
    .line 100
    iget-object v0, v0, Lh4/l;->a:Landroid/content/Context;

    .line 101
    .line 102
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    new-instance v4, Landroid/graphics/drawable/BitmapDrawable;

    .line 107
    .line 108
    check-cast v2, Landroid/graphics/Bitmap;

    .line 109
    .line 110
    invoke-direct {v4, v0, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 111
    .line 112
    .line 113
    invoke-direct {v3, v4, v1, p1}, Lb4/d;-><init>(Landroid/graphics/drawable/Drawable;ZI)V

    .line 114
    .line 115
    .line 116
    return-object v3

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
