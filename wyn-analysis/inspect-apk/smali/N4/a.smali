.class public final LN4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE4/B;
.implements LE4/x;


# instance fields
.field public final a:Landroid/graphics/drawable/Drawable;

.field public final synthetic b:I


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;I)V
    .locals 0

    .line 1
    iput p2, p0, LN4/a;->b:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string p2, "Argument must not be null"

    .line 7
    .line 8
    invoke-static {p1, p2}, Lgc/b;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, LN4/a;->a:Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    return-void
.end method

.method private final c()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    iget v0, p0, LN4/a;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LN4/a;->a:Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    check-cast v0, LP4/c;

    .line 9
    .line 10
    invoke-virtual {v0}, LP4/c;->stop()V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    iput-boolean v1, v0, LP4/c;->d:Z

    .line 15
    .line 16
    iget-object v0, v0, LP4/c;->a:LP4/b;

    .line 17
    .line 18
    iget-object v0, v0, LP4/b;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, LP4/h;

    .line 21
    .line 22
    iget-object v2, v0, LP4/h;->c:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 25
    .line 26
    .line 27
    iget-object v2, v0, LP4/h;->l:Landroid/graphics/Bitmap;

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    iget-object v4, v0, LP4/h;->e:LF4/a;

    .line 33
    .line 34
    invoke-interface {v4, v2}, LF4/a;->f(Landroid/graphics/Bitmap;)V

    .line 35
    .line 36
    .line 37
    iput-object v3, v0, LP4/h;->l:Landroid/graphics/Bitmap;

    .line 38
    .line 39
    :cond_0
    const/4 v2, 0x0

    .line 40
    iput-boolean v2, v0, LP4/h;->f:Z

    .line 41
    .line 42
    iget-object v2, v0, LP4/h;->i:LP4/e;

    .line 43
    .line 44
    iget-object v4, v0, LP4/h;->d:Lcom/bumptech/glide/h;

    .line 45
    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    invoke-virtual {v4, v2}, Lcom/bumptech/glide/h;->c(LV4/a;)V

    .line 49
    .line 50
    .line 51
    iput-object v3, v0, LP4/h;->i:LP4/e;

    .line 52
    .line 53
    :cond_1
    iget-object v2, v0, LP4/h;->k:LP4/e;

    .line 54
    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    invoke-virtual {v4, v2}, Lcom/bumptech/glide/h;->c(LV4/a;)V

    .line 58
    .line 59
    .line 60
    iput-object v3, v0, LP4/h;->k:LP4/e;

    .line 61
    .line 62
    :cond_2
    iget-object v2, v0, LP4/h;->m:LP4/e;

    .line 63
    .line 64
    if-eqz v2, :cond_3

    .line 65
    .line 66
    invoke-virtual {v4, v2}, Lcom/bumptech/glide/h;->c(LV4/a;)V

    .line 67
    .line 68
    .line 69
    iput-object v3, v0, LP4/h;->m:LP4/e;

    .line 70
    .line 71
    :cond_3
    iget-object v2, v0, LP4/h;->a:LA4/d;

    .line 72
    .line 73
    iput-object v3, v2, LA4/d;->l:LA4/b;

    .line 74
    .line 75
    iget-object v4, v2, LA4/d;->i:[B

    .line 76
    .line 77
    iget-object v5, v2, LA4/d;->c:LS3/c;

    .line 78
    .line 79
    if-eqz v4, :cond_4

    .line 80
    .line 81
    iget-object v6, v5, LS3/c;->c:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v6, LF4/f;

    .line 84
    .line 85
    invoke-virtual {v6, v4}, LF4/f;->i(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    :cond_4
    iget-object v4, v2, LA4/d;->j:[I

    .line 89
    .line 90
    if-eqz v4, :cond_5

    .line 91
    .line 92
    iget-object v6, v5, LS3/c;->c:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v6, LF4/f;

    .line 95
    .line 96
    invoke-virtual {v6, v4}, LF4/f;->i(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_5
    iget-object v4, v2, LA4/d;->m:Landroid/graphics/Bitmap;

    .line 100
    .line 101
    if-eqz v4, :cond_6

    .line 102
    .line 103
    iget-object v6, v5, LS3/c;->b:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v6, LF4/a;

    .line 106
    .line 107
    invoke-interface {v6, v4}, LF4/a;->f(Landroid/graphics/Bitmap;)V

    .line 108
    .line 109
    .line 110
    :cond_6
    iput-object v3, v2, LA4/d;->m:Landroid/graphics/Bitmap;

    .line 111
    .line 112
    iput-object v3, v2, LA4/d;->d:Ljava/nio/ByteBuffer;

    .line 113
    .line 114
    iput-object v3, v2, LA4/d;->s:Ljava/lang/Boolean;

    .line 115
    .line 116
    iget-object v2, v2, LA4/d;->e:[B

    .line 117
    .line 118
    if-eqz v2, :cond_7

    .line 119
    .line 120
    iget-object v3, v5, LS3/c;->c:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v3, LF4/f;

    .line 123
    .line 124
    invoke-virtual {v3, v2}, LF4/f;->i(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    :cond_7
    iput-boolean v1, v0, LP4/h;->j:Z

    .line 128
    .line 129
    :pswitch_0
    return-void

    .line 130
    nop

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()Ljava/lang/Class;
    .locals 1

    .line 1
    iget v0, p0, LN4/a;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-class v0, LP4/c;

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    iget-object v0, p0, LN4/a;->a:Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final get()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LN4/a;->a:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method

.method public final getSize()I
    .locals 4

    .line 1
    iget v0, p0, LN4/a;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LN4/a;->a:Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    check-cast v0, LP4/c;

    .line 9
    .line 10
    iget-object v0, v0, LP4/c;->a:LP4/b;

    .line 11
    .line 12
    iget-object v0, v0, LP4/b;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, LP4/h;

    .line 15
    .line 16
    iget-object v1, v0, LP4/h;->a:LA4/d;

    .line 17
    .line 18
    iget-object v2, v1, LA4/d;->d:Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/nio/Buffer;->limit()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    iget-object v3, v1, LA4/d;->i:[B

    .line 25
    .line 26
    array-length v3, v3

    .line 27
    add-int/2addr v2, v3

    .line 28
    iget-object v1, v1, LA4/d;->j:[I

    .line 29
    .line 30
    array-length v1, v1

    .line 31
    mul-int/lit8 v1, v1, 0x4

    .line 32
    .line 33
    add-int/2addr v1, v2

    .line 34
    iget v0, v0, LP4/h;->n:I

    .line 35
    .line 36
    add-int/2addr v1, v0

    .line 37
    return v1

    .line 38
    :pswitch_0
    iget-object v0, p0, LN4/a;->a:Landroid/graphics/drawable/Drawable;

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    mul-int/2addr v0, v1

    .line 49
    mul-int/lit8 v0, v0, 0x4

    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    return v0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public initialize()V
    .locals 2

    .line 1
    iget v0, p0, LN4/a;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LN4/a;->a:Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    instance-of v1, v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    instance-of v1, v0, LP4/c;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    check-cast v0, LP4/c;

    .line 27
    .line 28
    iget-object v0, v0, LP4/c;->a:LP4/b;

    .line 29
    .line 30
    iget-object v0, v0, LP4/b;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, LP4/h;

    .line 33
    .line 34
    iget-object v0, v0, LP4/h;->l:Landroid/graphics/Bitmap;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_0
    return-void

    .line 40
    :pswitch_0
    iget-object v0, p0, LN4/a;->a:Landroid/graphics/drawable/Drawable;

    .line 41
    .line 42
    check-cast v0, LP4/c;

    .line 43
    .line 44
    iget-object v0, v0, LP4/c;->a:LP4/b;

    .line 45
    .line 46
    iget-object v0, v0, LP4/b;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, LP4/h;

    .line 49
    .line 50
    iget-object v0, v0, LP4/h;->l:Landroid/graphics/Bitmap;

    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
