package com.example.service

import android.os.AsyncTask

class MyTask: AsyncTask<Unit, Int, Boolean>() {

    override fun onPreExecute() {
        super.onPreExecute()
    }

    override fun doInBackground(vararg params: Unit?): Boolean {
        TODO("Not yet implemented")
    }

    override fun onProgressUpdate(vararg values: Int?) {
        super.onProgressUpdate(*values)
    }

    override fun onPostExecute(result: Boolean?) {
        super.onPostExecute(result)
    }
}