package me.chunyu.yuriel.kotdebugtool.components

import android.content.SharedPreferences
import me.chunyu.yuriel.kotdebugtool.core.BLOCK_THRESHOLD
import me.chunyu.yuriel.kotdebugtool.core.DEFAULT_BLOCK_THRESHOLD
import me.chunyu.yuriel.kotdebugtool.core.DT_SETTING_STORE_FILE

/**
 * Created by yuriel on 8/22/16.
 */
object __DTSettings {

    private fun getSP() = Installer.getSP(DT_SETTING_STORE_FILE)

    fun setBlockThreshold(threshold: Long) {
        getSP()?.edit()?.putLong(BLOCK_THRESHOLD, threshold)?.apply()
    }

    fun getBlockThreshold() = getSP()?.getLong(BLOCK_THRESHOLD, DEFAULT_BLOCK_THRESHOLD)?: DEFAULT_BLOCK_THRESHOLD

}